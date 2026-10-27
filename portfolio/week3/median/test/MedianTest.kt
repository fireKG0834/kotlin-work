// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }
    "Size of 1: median is the only element" {
        median(listOf(7.0f)) shouldBe (7.0f plusOrMinus tolerance)
    }

    "Size of 2: median is the mean of both elements" {
        median(listOf(2.0f, 6.0f)) shouldBe (4.0f plusOrMinus tolerance)
    }

    "Size of 3: median is the middle element of unsorted input" {
        median(listOf(9.0f, 1.0f, 5.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }

    "Size of 4: median is the mean of the middle two of unsorted input" {
        median(listOf(10.0f, 1.0f, 4.0f, 2.0f)) shouldBe (3.0f plusOrMinus tolerance)
    }
})
