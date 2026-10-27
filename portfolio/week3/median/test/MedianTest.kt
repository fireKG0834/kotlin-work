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
    "Size 1: median is the only element present" {
        median(listOf(3.5f)) shouldBe (3.5f plusOrMinus tolerance)
    }

    "Size 2: median is the middle of both elements" {
        median(listOf(8.0f, 2.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }

    "Size 3: median is the middle element when input is unsorted" {
        median(listOf(20.0f, 3.0f, 4.0f)) shouldBe (4.0f plusOrMinus tolerance)
    }

    "Size 4: median is the mean of the middle two elements when input is unsorted" {
        median(listOf(15.0f, 2.0f, 6.0f, 4.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }
})
