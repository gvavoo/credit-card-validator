package com.gvavoo.validator

class CreditCardValidator {

    /**
     *
     * Luhn's algorithm implementation to check if the card number
     * given is a valid credit card number.
     *
     * @param number
     * @return
     *
     */

    fun isCreditCardValid(number: String): Boolean {
        if (!number.matches(Regex("\\d{12,18}"))) {
            return false
        }

        var sum: Int = Integer.parseInt(number[number.length - 1].toString())
        val nDigits: Int = number.length
        val parity: Int = nDigits % 2
        for (i in 0 until nDigits - 1) {
            var digit = Integer.parseInt(number[i].toString())
            if (i % 2 == parity) digit *= 2
            if (digit > 9) digit -= 9
            sum += digit
        }
        return (sum % 10) == 0
    }
}