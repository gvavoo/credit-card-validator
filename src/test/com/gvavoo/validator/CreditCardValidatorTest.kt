package com.gvavoo.validator

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CreditCardValidatorTest {
    var creditCardValidator = CreditCardValidator()

    @Test
    fun isCreditCardValid_validCreditCards() {
        assertTrue(creditCardValidator.isCreditCardValid("4698988021391045"))
        assertTrue(creditCardValidator.isCreditCardValid("4485432030578844"))
        assertTrue(creditCardValidator.isCreditCardValid("4095894173257480"))
        assertTrue(creditCardValidator.isCreditCardValid("4485429330210862"))
        assertTrue(creditCardValidator.isCreditCardValid("4556843574638113"))
        assertTrue(creditCardValidator.isCreditCardValid("5459683882975848"))
        assertTrue(creditCardValidator.isCreditCardValid("5249161408154268"))
        assertTrue(creditCardValidator.isCreditCardValid("5255341343386164"))
        assertTrue(creditCardValidator.isCreditCardValid("5112177837169929"))
        assertTrue(creditCardValidator.isCreditCardValid("5301653628681992"))
        assertTrue(creditCardValidator.isCreditCardValid("6011634617387097"))
        assertTrue(creditCardValidator.isCreditCardValid("6011179418452989"))
        assertTrue(creditCardValidator.isCreditCardValid("6011808488550914"))
        assertTrue(creditCardValidator.isCreditCardValid("6011837671897857"))
        assertTrue(creditCardValidator.isCreditCardValid("6011036925413195"))
        assertTrue(creditCardValidator.isCreditCardValid("342189629514504"))
        assertTrue(creditCardValidator.isCreditCardValid("373335714285037"))
        assertTrue(creditCardValidator.isCreditCardValid("373291913091090"))
        assertTrue(creditCardValidator.isCreditCardValid("374342328991108"))
        assertTrue(creditCardValidator.isCreditCardValid("374591490255557"))
        assertTrue(creditCardValidator.isCreditCardValid("375366170820254"))
        assertTrue(creditCardValidator.isCreditCardValid("374734341587626"))
        assertTrue(creditCardValidator.isCreditCardValid("373150065172282"))
        assertTrue(creditCardValidator.isCreditCardValid("372064564257653"))
        assertTrue(creditCardValidator.isCreditCardValid("4003156723884747"))
        assertTrue(creditCardValidator.isCreditCardValid("4036503304022703"))
        assertTrue(creditCardValidator.isCreditCardValid("5323557457254546"))
        assertTrue(creditCardValidator.isCreditCardValid("4257037883855805"))
        assertTrue(creditCardValidator.isCreditCardValid("4002598077756016"))
        assertTrue(creditCardValidator.isCreditCardValid("5405102835136072"))
        assertTrue(creditCardValidator.isCreditCardValid("5137408511813123"))
        assertTrue(creditCardValidator.isCreditCardValid("4214020882834130"))
    }

    @Test
    fun isCreditCardValid_invalidCreditCards() {
        assertFalse(creditCardValidator.isCreditCardValid("4698988022391045"))
        assertFalse(creditCardValidator.isCreditCardValid("4485412030578844"))
        assertFalse(creditCardValidator.isCreditCardValid("409589z173257480"))
        assertFalse(creditCardValidator.isCreditCardValid("44854212330210862"))
        assertFalse(creditCardValidator.isCreditCardValid("1223333374638113"))
        assertFalse(creditCardValidator.isCreditCardValid("54596838za975848"))
        assertFalse(creditCardValidator.isCreditCardValid("5249161555154268"))
        assertFalse(creditCardValidator.isCreditCardValid("5255341343q86164"))
        assertFalse(creditCardValidator.isCreditCardValid("51121778?dd69929"))
        assertFalse(creditCardValidator.isCreditCardValid("5301653628681092"))
        assertFalse(creditCardValidator.isCreditCardValid("6011634617381097"))
        assertFalse(creditCardValidator.isCreditCardValid("6211179418452989"))
        assertFalse(creditCardValidator.isCreditCardValid("6111808488550914"))
        assertFalse(creditCardValidator.isCreditCardValid("6012317671897857"))
        assertFalse(creditCardValidator.isCreditCardValid("60xxx36925413195"))
        assertFalse(creditCardValidator.isCreditCardValid("342185629514504"))
        assertFalse(creditCardValidator.isCreditCardValid("373335714235037"))
        assertFalse(creditCardValidator.isCreditCardValid("373291919991090"))
        assertFalse(creditCardValidator.isCreditCardValid("374342328995108"))
        assertFalse(creditCardValidator.isCreditCardValid("374551490255557"))
        assertFalse(creditCardValidator.isCreditCardValid("375368170820254"))
        assertFalse(creditCardValidator.isCreditCardValid("374731341587626"))
        assertFalse(creditCardValidator.isCreditCardValid("3731500000012282"))
        assertFalse(creditCardValidator.isCreditCardValid("37206456zzz71653"))
        assertFalse(creditCardValidator.isCreditCardValid("4003156723884757"))
        assertFalse(creditCardValidator.isCreditCardValid("4086503304022703"))
        assertFalse(creditCardValidator.isCreditCardValid("5323557457255546"))
        assertFalse(creditCardValidator.isCreditCardValid("4257037883815805"))
        assertFalse(creditCardValidator.isCreditCardValid("4002528077756016"))
        assertFalse(creditCardValidator.isCreditCardValid("5405108835131072"))
        assertFalse(creditCardValidator.isCreditCardValid("5137418512813123"))
        assertFalse(creditCardValidator.isCreditCardValid("421402033333834130"))

        //magic numbers !!!
        assertFalse(creditCardValidator.isCreditCardValid("622126"))
        assertFalse(creditCardValidator.isCreditCardValid("41111"))
        assertFalse(creditCardValidator.isCreditCardValid(""))
//        assertFalse(creditCardValidator.isCreditCardValid(null))
    }
}