package net.threescale.api.cache;

import org.junit.Before;

public class DistributedCacheImplTest extends CacheImplTestCommon {

    @Before
    public void setUp() throws Exception {
        cache = new ConfiguredCacheImpl("etc/test-cache-configuration.xml");
    }
}
