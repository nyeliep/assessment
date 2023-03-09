fun main() {
    numbers()
    sentence("awkward")
    sentence("drinking")
    val math = calculator(12,4)
    add(12,4)
    substract(12,4)
    division(12,4)
    multiplication(12,4)




}
  /*Write and invoke a function that takes in any 2 strings and returns the first
character of the longer string or the first character of the first string if they are
equal in length. */




/* Write and invoke one function that takes in an array of integers and returns
these 3 values: smallest, largest and average of all the elements*/

fun numbers(){
    var number= arrayOf(12,2,4,67,92,45)
    println(number.min())
    println(number.max())
    println(number.average())
}



/*Write and call a function that takes in a string and splits it into all the
characters that constitute it. Your function should print out this output.*/

fun sentence(word:String){
    println(word.split(word))
}


/*Write and call a function that takes in an array of strings, joins them all into
one string and returns it.*/



/*Create a calculator class that is capable of the following functions:
(i) Addition of any 2 numbers
(ii) Subtraction between any 2 numbers
(iii) Accurate division between any 2 numbers
(iv) Multiplication of any 2 numbers
Instantiate your calculator object and invoke all its functions*/

class calculator(var num1:Int, var num2:Int){



}
fun add(num1:Int,num2:Int){
    var sum = num1 + num2
    println(sum)
}
fun substract(num3:Int,num4:Int,){
    var sub = num3 - num4
    println(sub)
}
fun division(num5:Int,num6:Int,){
    var div = num5/num6
    println(div)
}
fun multiplication(num7:Int,num8:Int,){
    var mult = num7*num8
    println(mult)
}

