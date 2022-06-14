package builder;

import com.liveon.domain.entities.place.Address;
import com.liveon.domain.entities.place.PlaceEntity;
import com.liveon.domain.value_objects.Location;

public class Builder {

    public static void main(String[] args) {
        try {
            var place = new PlaceEntity(
                    new Address(
                            new Location("123","456"),"","",""
                    ), 12
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
