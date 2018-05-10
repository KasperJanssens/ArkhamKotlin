package com.krondorsoft

import com.krondorsoft.board.findReachables
import com.krondorsoft.board.initializeGameState
import com.krondorsoft.board.moveInvestigator
import com.krondorsoft.investigators.Investigator
import com.krondorsoft.location.*
import io.kotlintest.matchers.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HelloTest {

    @Test
    fun moveAroundBoard (){
        val investigator = Investigator.AmandaSharpe(3)
        val gameState = initializeGameState(listOf(investigator))
        val reachables = findReachables(gameState, investigator)

        reachables should haveSize(18)

        val locations = reachables.map { p -> p.first }

        locations.containsAll(
                listOf(trainStation, northside, downtown, merchantDistrict, newspaper, curiosityShoppe)
        ) shouldBe true

        val northsidePath = reachables.find {
            it.first.equals(northside)
        }

        val northsideGraphPathEdgeList = northsidePath?.second?.edgeList ?: listOf()


        val newGameState = northsideGraphPathEdgeList.fold(gameState, { board, edge ->
            moveInvestigator(investigator.name, board, edge)
        })

        newGameState.investigatorLocations.get(investigator.name) shouldBe northside
    }

}
