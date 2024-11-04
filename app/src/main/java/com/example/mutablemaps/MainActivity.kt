fun main() {
    val stateCapitals = mutableMapOf(
        "Indiana" to "Indianapolis",
        "Ohio" to "columbus",
        "Illinois" to "Springfield"
    );

    stateCapitals["Kentucky"] = "Frankfurt";
    stateCapitals["Illinois"] = "Chicageo";
    stateCapitals.remove(key:"Ohio")
    println(stateCapitals["Kentucky"])
    println(stateCapitals["Illinois"]);

}
    stateCapitals["Indiana"] = "Columbus";
    stateCapitals["springfeild"] = "Ohio";
    stateCapitals.remove(key:"Indianapolis") = newValue
    println(stateCapitals["Indiana"])
    println(stateCapitals["springfeild"]);