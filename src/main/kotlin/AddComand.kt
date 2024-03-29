class AddCommand(val name: String, val type: String, val value: String) : Command() {
    override fun isValid(): Boolean {
        return when (type) {
            "phone" -> value.matches("^\\+?\\d+$".toRegex())
            "email" -> value.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$".toRegex())
            else -> false
        }
    }
}