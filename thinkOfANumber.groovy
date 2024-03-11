// test che non passa
import java.security.SecureRandom


while (true) {
    try {
        int x = new Math.random() * 6
        //for x in y



        int  a = 0




        print 'The computer has chosen a number between 0 and 5. Can you guess it?'
        def line = System.console().readLine()
        int g = line.toInteger()
        /*
        if (g == x) {
            println 'Well done'
        } else {
            println "Tough luck - you're wrong"
        }*/




        if (g == x) { println 'Well done' } else { println "Tough luck - you're wrong" }

     } catch (NumberFormatException e) {
        println "The computer didn't understand '$line'"
    }
}
