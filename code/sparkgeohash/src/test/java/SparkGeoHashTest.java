import com.tailtarget.sparksqlgeohash.udf.SparkGeoHash;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author babadopulos
 */
public class SparkGeoHashTest {


    @Test
    public void call() {

        SparkGeoHash sparkGeoHash = new SparkGeoHash();

        Assert.assertEquals("6g7", sparkGeoHash.call(-26.616633, -50.672099, 3));
        Assert.assertEquals("6g7bwftdy", sparkGeoHash.call(-26.616633, -50.672099, 9));

    }
}