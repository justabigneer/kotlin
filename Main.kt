//these are the bascis that i learned on my day one
fun main()
{
    println("Hello workd")
    val oneMil=1_000_00
    oneMil=2
    println(oneMil)  //This statement will not run because onrMil is constant and it cannot be reassigned
    //using int variables
    val count:Int=2 
    println(count+1)
    val read=5
    val unread=10
    println("you have $read read meassages and $unread unread messages")
    println("you have total of ${read + unread } messages")

    //to change the inital value of a variable in this program we need to use var insted of val
    var count=10
    count +=1
    println(count)
    var count=18
    println("you have $count unreadmessages")
    count--
    println("now you have $count unread messages")
        val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    //Strings
        val meeting="new meeting: "
    val date="Jan 2 "
    val time=" at 10:20 am"
    val remainder=meeting + date + time
    println("the meeting is $remainder")
     println("\"Hello\"")


     //Boolean
    val notification:Boolean=true 
    println("Is there notification? "+notification)
}