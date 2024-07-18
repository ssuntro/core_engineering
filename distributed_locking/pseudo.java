String LOCK_KEY = "ABCD"
int LOCK_EXPIRY_SECONDS = 10

main() {
    jedis = new Jedis("http://localhost:6379");
    try{
        String result = jedis.set(LOCK_KEY, "locked", "NX", "EX", LOCK_EXPIRY_SECONDS)
        if("OK" == result) {
            //locked
            performTask()
        }
    } finally { 
        if("locked" == jedis.get(LOCK_KEY)) {
            // release the lock
            jedis.del(LOCK_KEY)
        }
        jedis.close()
    }
}