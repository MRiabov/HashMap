import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CarMapTest {

    private CarMap map;

    @BeforeEach
      void setUp() {

    }

    void whenPut100DifferentElementsSizeBecomes100(){
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner=new CarOwner("Name"+i,i,"lastName"+i);
            Car car =new Car(i,"Brand"+i);
            map.put(carOwner,car);
            Assertions.assertEquals(100, map.size());
        }
    }

    @Test
    void whenPut100DifferentElementsWith10differentValuesThenSize10() {
        for (int i = 0; i < 100; i++) {
            int index = i%10;
            CarOwner carOwner=new CarOwner("Name"+index,index,"lastName"+index);
            Car car =new Car(index,"Brand"+index);
        }
        assertEquals(10, map.size());
    }

    @Test
    void getCanAccessExistingValue() {
        CarOwner carOwner=new CarOwner("Name",1,"lastName");
        Car car = new Car(1,"Brand");
        map.put(carOwner,car);
        assertEquals(map.get(carOwner), car);
    }

    @Test
    void countOfKeysEqualsCountOfValues() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner=new CarOwner("Name"+i,i,"lastName"+i);
            Car car =new Car(i,"Brand"+i);
        }
        assertEquals(100,map.size());
        assertEquals(100,map.values().size());
        assertEquals(100,map.keySet().size());
    }

    @Test
    void clearsTo0Size() {
        map.clear();
        assertEquals(0,map.size());
    }

    @Test
    void RemoveTrueOnlyOnce() {
        CarOwner carOwner=new CarOwner("Name",1,"lastName");
        Car car = new Car(1,"Brand");
        map.put(carOwner,car);
        assertTrue(map.remove(carOwner));
        assertEquals(0,map.size());
        assertFalse(map.remove(carOwner));
        assertFalse(map.remove(carOwner));
    }
}