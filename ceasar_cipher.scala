object ceasar{
    private val alphabet=('A' to 'Z').tolist
    def encipher(key: String, text: String ): String ={
        val cipher_alphabet=(key.toUpperCase.toList ::: alpphabet)
        val cipher_text=for(c<- text.toUpperCase)yield c match{
            case ' '=> ' '
            case_ => cipher_alphabet(alphbet.indexOf(c))
        }
        return cipher_text.mkString
    } 

    def main(args:Array[String]){
        val Array(text.key)=args
        println("Plaintext>>>>>"+ text)
        println("key>>>>>>>>>>>"+ key)
        println("Cipertext>>>>>"+encipher(key,text))
    }
}