package me.usatov.alexander.sorting.benchmarks

import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.Blackhole

@BenchmarkMode(Mode.All)
@Warmup(iterations = 10)
@Measurement(iterations = 100, batchSize = 10)
open class CompareInlineUseVsLambdaUse {

    @Benchmark
    fun inlineUse(blackhole: Blackhole) {
       /* NoopAutoCloseable(blackhole).use {
            blackhole.consume(1)
        }*/
    }

    @Benchmark
    fun lambdaUse(blackhole: Blackhole) {
        /*NoopAutoCloseable(blackhole).useNoInline {
            blackhole.consume(1)
        }*/
    }
}