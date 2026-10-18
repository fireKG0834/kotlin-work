// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(document: String, text: String, redactionSymbol: Char = 'X'): String {
    if (text.isEmpty()) return document
    return document.replace(text, redactionSymbol.toString().repeat(text.length))
}