//Question 2
import scala.io.StdIn.readInt;

object  Question {
    def encryption(): Unit = {
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345"
        val shift = (scala.io.StdIn.readLine("Shift Code: ").toInt + alphabet.size) % alphabet.size
        val inputText = scala.io.StdIn.readLine("Secret Message: ")
        val outputText = inputText.map( (c: Char) => { 
		val x = alphabet.indexOf(c.toUpper)

		if (x == -1){
			c
		}
		else{
			alphabet((x + shift) % alphabet.size)
		} 
	});
        println("Encrypted Message:" + outputText);
    }

    def decryption(): Unit = {
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345"
        val shift = (scala.io.StdIn.readLine("Shift Code: ").toInt + alphabet.size) % alphabet.size
        val inputText = scala.io.StdIn.readLine("Secret Message: ")
        val outputText = inputText.map( (c: Char) => { 
		val x = alphabet.indexOf(c.toUpper)

		if (x == -1){
			c
		}
		else{
			alphabet((x - shift) % alphabet.size)
		} 
	});
        println("Decrypted Message:" + outputText);
    }
    def Cipher(num:Int) : Unit = num match {

        case x if x == 0 => encryption()
        case x if x == 1 => decryption()
    }

    def main(args: Array[String]): Unit = {

        var option = scala.io.StdIn.readLine("Type 0 for Encryption/ Type 1 for Decryption: ").toInt
        Cipher(option)
    }
}