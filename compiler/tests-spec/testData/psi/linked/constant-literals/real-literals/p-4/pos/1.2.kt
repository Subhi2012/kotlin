/*
 * KOTLIN PSI SPEC TEST (POSITIVE)
 *
 * SECTIONS: constant-literals, real-literals
 * PARAGRAPH: 4
 * SENTENCE: [1] The digits of the whole-number part or the fraction part or the exponent may be optionally separated by underscores, but an underscore may not be placed between, before, or after these parts.
 * NUMBER: 2
 * DESCRIPTION: Real literals suffixed by f/F (float suffix) with underscores in a whole-number part and a fraction part.
 */

val value = 0.0_0f
val value = 0.0__0___0F
val value = 0.0_0__0_0F

val value = 0__0.0f
val value = 0_0_0.0______0f
val value = 00_______________00.0_0_0f

val value = 2_2.0_0F
val value = 33__3.00__0f
val value = 4_44____4.00______00F
val value = 5_________555_________5.0F
val value = 666_666.0_____________________________________________________________________________________________________________________0F
val value = 7777777.0_0_0f
val value = 8888888_8.0000f
val value = 9_______9______9_____9____9___9__9_9.0F

val value = 0_0_0_0_0_0_0_0_0_0.1234567890F
val value = 1_2_3_4_5_6_7_8_9.2_3_4_5_6_7_8_9f
val value = 234_5_678.345______________678f
val value = 3_456_7.4567f
val value = 456.5_6F
val value = 5.6_5F
val value = 6_54.7654f
val value = 7_6543.87654_3f
val value = 876543_____________2.9_____________8765432f
val value = 9_____________87654321.098765432_____________1F

val value = 000000000000000000000000000000000000000000000000000000000000000000000000000000000000000___0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000_0F
val value = 0_000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.0___000000000000000000000000000000000000000000000000000000000000000000000000000000000000000f
val value = 9999999999999999999999999999999999999999999_______________999999999999999999999999999999999999999999999.33333333333333333333333333333333333333333333333_33333333333333333333333333333333333333333f
