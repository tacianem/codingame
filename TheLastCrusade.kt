import java.util.*
import java.io.*
import java.math.*

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val cols = input.nextInt() 
    val rows = input.nextInt() 
    System.err.println(cols)
    System.err.println(rows)
    
    val lines = ArrayList<ArrayList<Int>>()
    
    if (input.hasNextLine()) {
        val inp = input.nextLine()
    }
    
    for (i in 0 until rows) {
        var rooms = ArrayList<Int>()
        val line = input.nextLine() //each integer represents one room of a given type
        System.err.println("Line $i: $line")
        
        val splitted = line.split(" ")
        for (s in splitted) {
            rooms.add(s.toInt())
        }
        lines.add(rooms)
    }
    System.err.println("Lines >> $lines")
    
    val ex = input.nextInt() //not used for now

    val entries = mapOf(Pair(1,"LEFT") to "DOWN", Pair(1,"TOP") to "DOWN", Pair(1,"RIGHT") to "DOWN",
    Pair(2,"LEFT") to "RIGHT", Pair(2,"RIGHT") to "LEFT",
    Pair(3,"TOP") to "DOWN", 
    Pair(4,"TOP") to "LEFT", Pair(4,"RIGHT") to "DOWN",
    Pair(5,"LEFT") to "DOWN", Pair(5,"TOP") to "RIGHT",
    Pair(6,"LEFT") to "RIGHT", Pair(6,"RIGHT") to "LEFT",
    Pair(7,"TOP") to "DOWN", Pair(7,"RIGHT") to "DOWN",
    Pair(8,"LEFT") to "DOWN", Pair(8,"RIGHT") to "DOWN",
    Pair(9,"LEFT") to "DOWN", Pair(9,"TOP") to "DOWN",
    Pair(10,"TOP") to "LEFT", 
    Pair(11,"TOP") to "RIGHT", 
    Pair(12,"RIGHT") to "DOWN",
    Pair(13,"LEFT") to "DOWN")

    System.err.println("ENTRIES >>>>>>>> $entries")
    
    while (true) {
        val x = input.nextInt()
        val y = input.nextInt()
        val pos = input.next()

        System.err.println("($x,$y) $pos")
        
        val lineY = lines[y]
        val room = lineY[x] 
        
        val exit = entries.get(Pair(room, pos))

        System.err.println(room)
        
        if (exit == "DOWN") {
            println("$x ${y+1}")
            System.err.println("down")
        }
        else if (exit == "LEFT") {
            println("${x-1} $y")
            System.err.println("left")
        }
        else {
            println("${x+1} $y")
            System.err.println("right")
        }
    }
}


















