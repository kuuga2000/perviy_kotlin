fun main(args: Array<String>) {
    val heroes = listOf("Aparata","Abadon","Brista","Chentaur","Dazzle","Anti-Mage")
    println(heroes)
    println(heroes.sorted())
    println(heroes[2])
    println(heroes.contains("Arc"))
    println(heroes.size)
    var skills = arrayListOf("Rupture", "Blinks", "Gust")
    skills.add(1,"Tsunami")
    println(skills.size)
    println(skills)
    println(skills.indexOf("Rupture"))

    //skills.removeAt(0)
    skills.remove("Blinks")
    println(skills)

    val heroesWithSkills = mapOf("Bs" to "Rupture", "Anti-Mage" to "Blink")
    println(heroesWithSkills)

    println(heroesWithSkills["Bs"])
    println(heroesWithSkills.get("Anti-Mage"))
    println(heroesWithSkills.getOrDefault("Viper","Toxic Skin"))
    println(heroesWithSkills.values)

    val hasSkills = hashMapOf("Monkey King" to "Jinggu Mastery","Riki Maru" to "Blink Strike")
    hasSkills["Skywright-Mage"] = "Ancient Shield"
    hasSkills.put("Legion Commander","Duel")
    println(hasSkills)
    println(hasSkills.isEmpty())
    println(heroes.isEmpty())
    println(skills.isEmpty())




}