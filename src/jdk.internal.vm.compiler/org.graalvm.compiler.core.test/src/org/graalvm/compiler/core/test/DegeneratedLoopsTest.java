/*
 * Copyright (c) 2011, 2018, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


package org.graalvm.compiler.core.test;

import org.graalvm.compiler.debug.DebugContext;
import org.graalvm.compiler.debug.DebugDumpScope;
import org.graalvm.compiler.nodes.StructuredGraph;
import org.graalvm.compiler.nodes.StructuredGraph.AllowAssumptions;
import org.graalvm.compiler.phases.common.CanonicalizerPhase;
import org.graalvm.compiler.phases.tiers.HighTierContext;
import org.junit.Test;

/**
 * In the following tests, the usages of local variable "a" are replaced with the integer constant
 * 0. Then canonicalization is applied and it is verified that the resulting graph is equal to the
 * graph of the method that just has a "return 1" statement in it.
 */
public class DegeneratedLoopsTest extends GraalCompilerTest {

    private static final String REFERENCE_SNIPPET = "referenceSnippet";

    @SuppressWarnings("all")
    public static int referenceSnippet(int a) {
        return a;
    }

    @Test
    public void test1() {
        test("test1Snippet");
    }

    private static class UnresolvedException extends RuntimeException {

        private static final long serialVersionUID = 5215434338750728440L;

        static {
            if (true) {
                throw new UnsupportedOperationException("this class may never be initialized");
            }
        }
    }

    @SuppressWarnings("all")
    public static int test1Snippet(int a) {
        for (;;) {
            try {
                test();
                break;
            } catch (UnresolvedException e) {
            }
        }
        return a;
    }

    private static void test() {

    }

    @SuppressWarnings("try")
    private void test(final String snippet) {
        DebugContext debug = getDebugContext();
        try (DebugContext.Scope s = debug.scope("DegeneratedLoopsTest", new DebugDumpScope(snippet))) {
            StructuredGraph graph = parseEager(snippet, AllowAssumptions.YES);
            HighTierContext context = getDefaultHighTierContext();
            createInliningPhase().apply(graph, context);
            new CanonicalizerPhase().apply(graph, context);
            debug.dump(DebugContext.BASIC_LEVEL, graph, "Graph");
            StructuredGraph referenceGraph = parseEager(REFERENCE_SNIPPET, AllowAssumptions.YES);
            debug.dump(DebugContext.BASIC_LEVEL, referenceGraph, "ReferenceGraph");
            assertEquals(referenceGraph, graph);
        } catch (Throwable e) {
            throw debug.handle(e);
        }
    }
}
