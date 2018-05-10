package com.krondorsoft.investigators

import com.krondorsoft.location.*

sealed class Investigator constructor(val name: Names,
                                      val location: ArkhamLocation,
                                      val speed : Int){

    data class AmandaSharpe(val initialSpeed: Int):
            Investigator(Names.AMANDA_SHARPE, bankOfArkham, initialSpeed)
    data class AshcanPete(val initialSpeed: Int):
            Investigator(Names.ASHCAN_PETE, riverDocks, initialSpeed)
    data class BobJenkins(val initialSpeed: Int):
            Investigator(Names.BOB_JENKINS, generalStore, initialSpeed)
    data class CarolynFern(val initialSpeed: Int):
            Investigator(Names.CAROLYN_FERN, arkhamAsylum, initialSpeed)
    data class DarrellSimmons(val initialSpeed: Int):
            Investigator(Names.DARRELL_SIMMONS, newspaper, initialSpeed)
    data class DexterDrake(val initialSpeed: Int):
            Investigator(Names.DEXTER_DRAKE, yeOldeMagickShoppe, initialSpeed)
    data class GloriaGoldberg(val initialSpeed: Int):
            Investigator(Names.GLORIA_GOLDBERG, velmasDiner, initialSpeed)
    data class HarveyWalters(val initialSpeed: Int):
            Investigator(Names.HARVEY_WALTERS, administration, initialSpeed)
    data class JennyBarnes(val initialSpeed: Int):
            Investigator(Names.JENNY_BARNES, trainStation, initialSpeed)
    data class JoeDiamond(val initialSpeed: Int):
            Investigator(Names.JOE_DIAMOND, policeStation, initialSpeed)
    data class KateWinthrop(val initialSpeed: Int):
            Investigator(Names.KATE_WINTHROP, scienceBuilding, initialSpeed)
    data class MandyThompson(val initialSpeed: Int):
            Investigator(Names.MANDY_THOMPSON, library, initialSpeed)
    data class MichaelMcGlen(val initialSpeed: Int):
            Investigator(Names.MICHAEL_MG_GLEN, masBoardingHouse, initialSpeed)
    data class MontereyJack(val initialSpeed: Int):
            Investigator(Names.MONTEREY_JACK, curiosityShoppe, initialSpeed)
    data class SisterMary(val initialSpeed: Int):
            Investigator(Names.SISTER_MARY, southChurch, initialSpeed)
    data class VincentLee(val initialSpeed: Int):
            Investigator(Names.VINCENT_LEE, stMarysHospital, initialSpeed)
}