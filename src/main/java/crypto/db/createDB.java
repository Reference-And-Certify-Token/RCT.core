package crypto.db;

import org.rocksdb.RocksDB;
import org.rocksdb.Options;
import org.rocksdb.RocksDBException;

public class createDB {
    public static void main(String[] args) {
        System.out.println("----db----");
        RocksDB.loadLibrary();

        try (final Options options = new Options().setCreateIfMissing(true)) {

            // a factory method that returns a RocksDB instance
            try (final RocksDB db = RocksDB.open(options, "/Users/yaojinsun/test/rocksdb")) {
                System.out.println("----db create----");
            }
        }catch (RocksDBException e) {
            System.out.println("----db Failed----");
        }

        static byte[] key1  = "Any String you want".getBytes();;
        static byte[] key2  = "Some Strings you want".getBytes();;

        System.out.println(key1);
        System.out.println(key2);

        RocksDB.put(key1,key2);


    }


}














