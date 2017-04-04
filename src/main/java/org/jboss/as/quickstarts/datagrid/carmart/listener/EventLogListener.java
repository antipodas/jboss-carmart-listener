package org.jboss.as.quickstarts.datagrid.carmart.listener;

import org.infinispan.client.hotrod.annotation.ClientCacheEntryCreated;
import org.infinispan.client.hotrod.annotation.ClientCacheEntryModified;
import org.infinispan.client.hotrod.annotation.ClientCacheEntryRemoved;
import org.infinispan.client.hotrod.annotation.ClientListener;
import org.infinispan.client.hotrod.event.ClientEvent;

@ClientListener
public class EventLogListener {

	 @ClientCacheEntryCreated
	 @ClientCacheEntryModified
	 @ClientCacheEntryRemoved
	 public void handleRemoteEvent(ClientEvent event) {
	   System.out.println(event);
	  }

}
