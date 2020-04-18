fun main(args: Array<String>) {
    val string_1 = "abcdefghi"
    val string_2 = "abcdeghfi"
    var count =0
        for ((key_1,value_1 ) in string_1.withIndex()){
            for ((key_2,value_2 ) in string_2.withIndex()){
                if(key_1==key_2){
                    if(value_1==value_2){
                        count=count+1
                    }
                }
            }
        }
    println(count)
}
