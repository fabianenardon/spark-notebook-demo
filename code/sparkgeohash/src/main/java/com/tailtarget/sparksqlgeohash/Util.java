package com.tailtarget.sparksqlgeohash;

import java.util.Date;
import com.tailtarget.sparksqlgeohash.udf.SparkGeoHash;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;

/**
 * @author fabiane
 */
public class Util {

    public static Date tellTime() {
    	return new Date();
    }

    public static void registerUDFS(SparkSession context) {
    	context.udf().register("geoHash", new SparkGeoHash(), DataTypes.StringType);
    }
}
