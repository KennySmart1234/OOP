package dSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {


    ArrayList myArrayList;

    @BeforeEach
    public void SetUp(){
        //Given
        myArrayList = new ArrayList();
    }

    @Test
    public void createMyArrayList_checkThatIsEmptyTest(){

        //Check
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void createMyArrayList_addItemIntoMyArrayList_checkThatIsEmptyIsFalseTest(){

        //when
        myArrayList.add("Kenny");

        //Check That
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void  createMyArrayList_add2ItemsIntoMyArrayList_checkThatIsEmptyisFalseAndTheSizeIsTwoTest(){

        //When
        myArrayList.add("Kenny");
        myArrayList.add("Olatunji");

        //CheckThat
        assertFalse(myArrayList.isEmpty());
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void createMyArrayList_add3Items_removeAnItem_checkThatTheLengthIs2Test(){
        //Given
        myArrayList.add("Smart");
        myArrayList.add("Kenny");
        myArrayList.add("Olatunji");

        //When
        myArrayList.remove(1);

        //Check that
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void createMyArrayList_add5Items_remove2Item_checkThatTheLengthIs3Test(){
        //Given
        myArrayList.add("Kenny");
        myArrayList.add("Taiwo");
        myArrayList.add("Olatunji");
        myArrayList.add("Smart");
        myArrayList.add("Kehinde");

        //When
        myArrayList.remove(1);
        myArrayList.remove(4);

        //Check that
        assertEquals(3, myArrayList.size());
    }

    @Test
    public void add10Elements_checkThatItIsFullTest(){
        //When
        myArrayList.add("Kenny");
        myArrayList.add("Taiwo");
        myArrayList.add("Olatunji");
        myArrayList.add("Smart");
        myArrayList.add("Kehinde");
        myArrayList.add("Kenny");
        myArrayList.add("Taiwo");
        myArrayList.add("Olatunji");
        myArrayList.add("Smart");
        myArrayList.add("Kehinde");


        assertTrue(myArrayList.isFull());



    }

    @Test
    public void add10Elements_checkThatItIsFull_addAnItemAgainAndMyArrayListIsNotFullTest(){
        //When
        myArrayList.add("Kenny");
        myArrayList.add("Taiwo");
        myArrayList.add("Olatunji");
        myArrayList.add("Smart");
        myArrayList.add("Kehinde");
        myArrayList.add("Kenny");
        myArrayList.add("Taiwo");
        myArrayList.add("Olatunji");
        myArrayList.add("Smart");
        myArrayList.add("Kehinde");


        assertTrue(myArrayList.isFull());


        myArrayList.add("Stephen");
        assertFalse(myArrayList.isFull());
    }

    @Test
    public void createMyListCallTheEnsureCapacityAtSize20_add10Items_checkthatTheListIsNotFullTest(){
        //When
        myArrayList.ensureCapacity(20);

        myArrayList.add("Kenny");
        myArrayList.add("Taiwo");
        myArrayList.add("Olatunji");
        myArrayList.add("Smart");
        myArrayList.add("Kehinde");
        myArrayList.add("Kenny");
        myArrayList.add("Taiwo");
        myArrayList.add("Olatunji");
        myArrayList.add("Smart");
        myArrayList.add("stephen");

        //check that
        assertFalse(myArrayList.isFull());
    }

    @Test
    public void createMyArrayList_add5Items_checkThatMyListContainsThatElementsTest(){
        //When
        myArrayList.add("Kenny");
        myArrayList.add("Taiwo");
        myArrayList.add("Olatunji");
        myArrayList.add("Smart");
        myArrayList.add("Kehinde");

        //Check that
        assertTrue(myArrayList.contains("Smart"));
    }

}
