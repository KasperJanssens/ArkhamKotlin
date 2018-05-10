package com.krondorsoft.location

sealed class ArkhamLocation constructor (val name: String){
    data class Northside(val locName: String): ArkhamLocation(locName)
    data class Downtown(val locName: String): ArkhamLocation(locName)
    data class Easttown(val locName: String): ArkhamLocation(locName)
    data class MerchantDistrict(val locName: String): ArkhamLocation(locName)
    data class Rivertown(val locName: String): ArkhamLocation(locName)
    data class Miskatonic(val locName: String): ArkhamLocation(locName)
    data class FrenchHill(val locName: String): ArkhamLocation(locName)
    data class Uptown(val locName: String): ArkhamLocation(locName)
    data class Southside(val locName: String): ArkhamLocation(locName)
}

val trainStation = ArkhamLocation.Northside("Train Station")
val curiosityShoppe = ArkhamLocation.Northside("Curiositie Shoppe")
val northside = ArkhamLocation.Northside("Northside")
val newspaper = ArkhamLocation.Northside("Newspaper")

val bankOfArkham = ArkhamLocation.Downtown("Bank of Arkham")
val arkhamAsylum = ArkhamLocation.Downtown("ArkhamAsylum")
val independenceSquare = ArkhamLocation.Downtown("Independence Station")
val downtown = ArkhamLocation.Downtown("Downtown")

val hibbsRoadhouse = ArkhamLocation.Easttown("Hibb's Roadhouse")
val velmasDiner = ArkhamLocation.Easttown("Velma's Diner")
val easttown = ArkhamLocation.Easttown("Easttown")
val policeStation = ArkhamLocation.Easttown("Police Station")

val rivertown = ArkhamLocation.Rivertown("Rivertown")
val graveyard = ArkhamLocation.Rivertown("Graveyard")
val generalStore = ArkhamLocation.Rivertown("General Store")
val blackCave = ArkhamLocation.Rivertown("Black Cave")

val unvisitedIsle = ArkhamLocation.MerchantDistrict("Unvisited Isle")
val merchantDistrict = ArkhamLocation.MerchantDistrict("Merchant District")
val riverDocks = ArkhamLocation.MerchantDistrict("River Docks")
val theUnnamable = ArkhamLocation.MerchantDistrict("The Unnamable")

val scienceBuilding = ArkhamLocation.Miskatonic("Science Building")
val administration = ArkhamLocation.Miskatonic("Administration")
val miskatonicUniversity = ArkhamLocation.Miskatonic("Miskatonic University")
val library = ArkhamLocation.Miskatonic("Library")

val frenchHill = ArkhamLocation.FrenchHill("French Hill")
val theWitchHouse = ArkhamLocation.FrenchHill("The Witch House")
val silverTwilightLodge = ArkhamLocation.FrenchHill("Silver Twilight Lodge")

val stMarysHospital = ArkhamLocation.Uptown("St. Mary's Hospital")
val uptown = ArkhamLocation.Uptown("Uptown")
val woods = ArkhamLocation.Uptown("Woods")
val yeOldeMagickShoppe = ArkhamLocation.Uptown("Ye Olde Magick Shoppe")

val southside = ArkhamLocation.Southside("Southside")
val masBoardingHouse = ArkhamLocation.Southside("Ma's Boarding House")
val historicalSociety = ArkhamLocation.Southside("Historical Society")
val southChurch = ArkhamLocation.Southside("South Church")

val arkhamLocations = listOf(trainStation, curiosityShoppe, newspaper, northside,
        bankOfArkham, arkhamAsylum, independenceSquare, downtown,
        easttown, hibbsRoadhouse, velmasDiner, policeStation,
        rivertown, graveyard, blackCave, generalStore,
        frenchHill, silverTwilightLodge, theWitchHouse,
        southside, southChurch, masBoardingHouse, historicalSociety,
        uptown, woods, yeOldeMagickShoppe, stMarysHospital,
        miskatonicUniversity, scienceBuilding, administration, library,
        merchantDistrict, theUnnamable, riverDocks, unvisitedIsle)