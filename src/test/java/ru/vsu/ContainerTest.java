package ru.vsu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ContainerTest {
    //Container test = new Container();
    @Test
    void add() {
        Container testContainer = new Container();
        int[] elements = {0, 1, 2, -1, -2, -30, 10, 100, -70, 0};
        for(int elem: elements)
            testContainer.add(elem);

        for(int i = 0; i < elements.length; ++i){
            assertEquals(elements[i], testContainer.getElementAt(i));
        }
    }

    @Test
    void removeAtPosition() {
        Container testContainer = new Container();
        int[] elementsInList = {0, 1, 2, -1, -2, -30, 10, 100, -70, 0};
        int[] elementsToStay = {1, -1, -2, -30, 10, -70};
        int[] elementsIndexesToDelete = {0, 1, 5, elementsInList.length - 1};
        for(int elem: elementsInList)
            testContainer.add(elem);
        for(int ind: elementsIndexesToDelete)
            testContainer.removeAtPosition(ind);

        for(int i = 0; i < elementsToStay.length; ++i){
            assertEquals(elementsToStay[i], testContainer.getElementAt(i));
        }
    }

    @Test
    void removeByElement() {
        Container testContainer = new Container();
        int[] elementsInList = {0, 20, 68, -68, 10, 1000, -70, 0};
        int[] elementsToStay = {20, 68, 10, -70};
        int[] elementsToDelete = {0, -68, 1000, 0};
        for(int elem: elementsInList)
            testContainer.add(elem);
        for(int elem: elementsToDelete)
            testContainer.removeByElement(elem);

        for(int i = 0; i < elementsToStay.length; ++i){
            assertEquals(elementsToStay[i], testContainer.getElementAt(i));
        }
    }

    @Test
    void getElementAt_CorrectPosition() {
        Container testContainer = new Container();
        Random rnd = new Random();
        int size = 20;
        ArrayList<Integer> testAList = new ArrayList<Integer>();
        for(int i = 0; i < size; ++i){
            int tmp = rnd.nextInt();
            testAList.add(tmp);
            testContainer.add(tmp);
        }

        for(int i = 0; i < size; ++i){
            assertEquals(testAList.get(i), testContainer.getElementAt(i));
        }
    }

    @Test
    void getElementAt_InCorrectPosition() {
        Container testContainer = new Container();
        int[] incorrectPositions = {-68, 10, 1000, -70, 0};
        for(int pos: incorrectPositions){
            assertNull(testContainer.getElementAt(pos));
        }
    }
}