 import kotlin.random.Random as KRandom
 import java.util.Random as JRandom

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " + KRandom.nextInt(2 ) +
            // KRandom.nextInt(2) +
            " Java random:" + JRandom().nextInt(2)+
            // JRandom().nextInt(2) +
            "."
}