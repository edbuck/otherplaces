dataSource {
	pooled = true
	driverClassName = "org.hsqldb.jdbcDriver"
	username = "sa"
	password = ""
}
hibernate {
    cache.use_second_level_cache=true
    cache.use_query_cache=true
    cache.provider_class='com.opensymphony.oscache.hibernate.OSCacheProvider'
}
// environment specific settings
environments {
	development {
		dataSource {
            		dbCreate = "create" // one of 'create', 'create-drop', 'update'
			url = "jdbc:hsqldb:file:db/devPhotosDB"
		}
	}
	test {
		dataSource {
			dbCreate = "create"
			url = "jdbc:hsqldb:file:db/testPhotosDB"
		}
	}
	production {
		dataSource {
			dbCreate = "create"
			url = "jdbc:hsqldb:file:db/prodPhotosDB"
		}
	}
}