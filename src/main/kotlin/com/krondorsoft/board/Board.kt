package com.krondorsoft.board

import com.krondorsoft.investigators.Investigator
import com.krondorsoft.investigators.Names
import com.krondorsoft.location.*
import org.jgrapht.GraphPath
import org.jgrapht.alg.shortestpath.DijkstraShortestPath
import org.jgrapht.graph.DefaultDirectedGraph
import org.jgrapht.graph.DefaultEdge
import org.jgrapht.graph.SimpleGraph

fun initializeBoard() : SimpleGraph<ArkhamLocation, DefaultEdge> {
    val board = SimpleGraph<ArkhamLocation,
        DefaultEdge>(DefaultEdge::class.java)
    arkhamLocations.forEach {
        board.addVertex(it)
    }
    board.addEdge(trainStation, northside)
    board.addEdge(newspaper, northside)
    board.addEdge(curiosityShoppe, northside)

    board.addEdge(bankOfArkham, downtown)
    board.addEdge(arkhamAsylum, downtown)
    board.addEdge(independenceSquare, downtown)

    board.addEdge(hibbsRoadhouse, easttown)
    board.addEdge(velmasDiner, easttown)
    board.addEdge(policeStation, easttown)

    board.addEdge(graveyard, rivertown)
    board.addEdge(blackCave, rivertown)
    board.addEdge(generalStore, rivertown)

    board.addEdge(silverTwilightLodge, frenchHill)
    board.addEdge(theWitchHouse, frenchHill)

    board.addEdge(unvisitedIsle, merchantDistrict)
    board.addEdge(riverDocks, merchantDistrict)
    board.addEdge(theUnnamable, merchantDistrict)

    board.addEdge(scienceBuilding, miskatonicUniversity)
    board.addEdge(administration, miskatonicUniversity)
    board.addEdge(library, miskatonicUniversity)

    board.addEdge(stMarysHospital, uptown)
    board.addEdge(yeOldeMagickShoppe, uptown)
    board.addEdge(woods, uptown)

    board.addEdge(masBoardingHouse, southside)
    board.addEdge(southChurch, southside)
    board.addEdge(historicalSociety, southside)

    board.addEdge(northside, downtown)
    board.addEdge(northside, merchantDistrict)
    board.addEdge(downtown, merchantDistrict)
    board.addEdge(downtown, easttown)
    board.addEdge(easttown, rivertown)
    board.addEdge(rivertown, merchantDistrict)
    board.addEdge(rivertown, frenchHill)
    board.addEdge(frenchHill, miskatonicUniversity)
    board.addEdge(frenchHill, southside)
    board.addEdge(southside, uptown)
    board.addEdge(uptown, miskatonicUniversity)
    board.addEdge(miskatonicUniversity, merchantDistrict)
    return board
} 

fun initializeWhiteBoard () : DefaultDirectedGraph<ArkhamLocation, DefaultEdge> {
    val whiteboard = DefaultDirectedGraph<ArkhamLocation,
            DefaultEdge>(DefaultEdge::class.java)
    arkhamLocations.forEach {
        whiteboard.addVertex(it)
    }
    whiteboard.addEdge(trainStation, northside)
    whiteboard.addEdge(newspaper, northside)
    whiteboard.addEdge(curiosityShoppe, northside)

    whiteboard.addEdge(bankOfArkham, downtown)
    whiteboard.addEdge(arkhamAsylum, downtown)
    whiteboard.addEdge(independenceSquare, downtown)

    whiteboard.addEdge(hibbsRoadhouse, easttown)
    whiteboard.addEdge(velmasDiner, easttown)
    whiteboard.addEdge(policeStation, easttown)

    whiteboard.addEdge(graveyard, rivertown)
    whiteboard.addEdge(blackCave, rivertown)
    whiteboard.addEdge(generalStore, rivertown)

    whiteboard.addEdge(silverTwilightLodge, frenchHill)
    whiteboard.addEdge(theWitchHouse, frenchHill)

    whiteboard.addEdge(unvisitedIsle, merchantDistrict)
    whiteboard.addEdge(riverDocks, merchantDistrict)
    whiteboard.addEdge(theUnnamable, merchantDistrict)

    whiteboard.addEdge(scienceBuilding, miskatonicUniversity)
    whiteboard.addEdge(administration, miskatonicUniversity)
    whiteboard.addEdge(library, miskatonicUniversity)

    whiteboard.addEdge(stMarysHospital, uptown)
    whiteboard.addEdge(yeOldeMagickShoppe, uptown)
    whiteboard.addEdge(woods, uptown)

    whiteboard.addEdge(masBoardingHouse, southside)
    whiteboard.addEdge(southChurch, southside)
    whiteboard.addEdge(historicalSociety, southside)

    whiteboard.addEdge(northside, downtown)
    whiteboard.addEdge(downtown, easttown)
    whiteboard.addEdge(easttown, rivertown)
    whiteboard.addEdge(rivertown, frenchHill)
    whiteboard.addEdge(frenchHill, southside)
    whiteboard.addEdge(southside, uptown)
    whiteboard.addEdge(uptown, miskatonicUniversity)
    whiteboard.addEdge(miskatonicUniversity, merchantDistrict)
    whiteboard.addEdge(merchantDistrict, northside)
    return whiteboard
}

fun initializeBlackBoard () : DefaultDirectedGraph<ArkhamLocation, DefaultEdge> {
    val blackboard = DefaultDirectedGraph<ArkhamLocation,
            DefaultEdge>(DefaultEdge::class.java)
    arkhamLocations.forEach {
        blackboard.addVertex(it)
    }
    blackboard.addEdge(trainStation, northside)
    blackboard.addEdge(newspaper, northside)
    blackboard.addEdge(curiosityShoppe, northside)

    blackboard.addEdge(bankOfArkham, downtown)
    blackboard.addEdge(arkhamAsylum, downtown)
    blackboard.addEdge(independenceSquare, downtown)

    blackboard.addEdge(hibbsRoadhouse, easttown)
    blackboard.addEdge(velmasDiner, easttown)
    blackboard.addEdge(policeStation, easttown)

    blackboard.addEdge(graveyard, rivertown)
    blackboard.addEdge(blackCave, rivertown)
    blackboard.addEdge(generalStore, rivertown)

    blackboard.addEdge(silverTwilightLodge, frenchHill)
    blackboard.addEdge(theWitchHouse, frenchHill)

    blackboard.addEdge(unvisitedIsle, merchantDistrict)
    blackboard.addEdge(riverDocks, merchantDistrict)
    blackboard.addEdge(theUnnamable, merchantDistrict)

    blackboard.addEdge(scienceBuilding, miskatonicUniversity)
    blackboard.addEdge(administration, miskatonicUniversity)
    blackboard.addEdge(library, miskatonicUniversity)

    blackboard.addEdge(stMarysHospital, uptown)
    blackboard.addEdge(yeOldeMagickShoppe, uptown)
    blackboard.addEdge(woods, uptown)

    blackboard.addEdge(masBoardingHouse, southside)
    blackboard.addEdge(southChurch, southside)
    blackboard.addEdge(historicalSociety, southside)

    blackboard.addEdge(downtown, northside)
    blackboard.addEdge(northside, merchantDistrict)
    blackboard.addEdge(merchantDistrict, miskatonicUniversity)
    blackboard.addEdge(miskatonicUniversity, uptown)
    blackboard.addEdge(uptown, southside)
    blackboard.addEdge(southside, frenchHill)
    blackboard.addEdge(frenchHill, rivertown)
    blackboard.addEdge(rivertown, easttown)
    blackboard.addEdge(easttown, downtown)
    return blackboard
}


val board = initializeBoard()
val whiteBoard = initializeWhiteBoard()
val blackBoard = initializeBlackBoard()

fun initializeGameState(participatingInvestigators : List<Investigator>) : GameState {
    val initialMap : Map<Names, ArkhamLocation> = HashMap()
    val investigatorMap = participatingInvestigators.fold(initialMap, {
        acc, investigator -> acc.plus(investigator.name to investigator.location)
    })
    return GameState(investigatorMap, participatingInvestigators)
}

class GameState constructor(val investigatorLocations : Map<Names, ArkhamLocation>,
                            val investigators: List<Investigator>) {
}

fun findReachables(gameState: GameState, investigator: Investigator): List<Pair<ArkhamLocation,
        GraphPath<ArkhamLocation, DefaultEdge>>> {
    val dijkstraShortestPath = DijkstraShortestPath(board)
    val currentLocation = gameState.investigatorLocations.get(investigator.name)
    val paths = dijkstraShortestPath.getPaths(currentLocation)
    val pathsWithinHops = mutableListOf<Pair<ArkhamLocation, GraphPath<ArkhamLocation, DefaultEdge>>>()
    arkhamLocations.forEach(
            {loc -> if(paths.getWeight(loc) <= investigator.speed) pathsWithinHops.add(loc.to(paths.getPath(loc))) }
    )
    return pathsWithinHops
}

fun setNewLocation(investigator:Names, newLocation : ArkhamLocation, gameState: GameState) : GameState{
    return GameState(gameState.investigatorLocations
            .minus(investigator)
            .plus(investigator to newLocation),
            gameState.investigators)
}


fun moveInvestigator(investigator: Names, gameState: GameState, edge: DefaultEdge) : GameState {
    val edgeSource = board.getEdgeSource(edge)
    val edgeTarget = board.getEdgeTarget(edge)
    val currentLocation = gameState.investigatorLocations.get(investigator)
    return when {
        edgeSource.equals(currentLocation) ->
                setNewLocation(investigator, edgeTarget, gameState)
        edgeTarget.equals(currentLocation) ->
                setNewLocation(investigator, edgeSource, gameState)
        else -> gameState
    }
}
