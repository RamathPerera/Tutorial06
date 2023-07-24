object Q1 extends App {
  def caesar_encrypt(text: String, shift: Int): String = {
    var encrypted_text = ""
    for (c <- text) {
      var index = c.toInt
      index += shift
      encrypted_text += index.toChar
    }
    encrypted_text
  }

  def caesar_decrypt(text: String, shift: Int): String = {
    var decrypted_text = ""
    for (c <- text) {
      var index = c.toInt
      index -= shift
      decrypted_text += index.toChar
    }
    decrypted_text
  }

  println("Encrypted: " + caesar_encrypt("HelloWorld", 3))
  println("Decrypted: " + caesar_decrypt("KhoorZruog",3))
}
