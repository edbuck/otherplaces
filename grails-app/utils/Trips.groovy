import java.text.SimpleDateFormat
class Trips {
	static def df = new SimpleDateFormat("yyyyMMdd")
	static final trips = 
	[ 
	  new Trip(name:"New England",
			     location:"Deering,NH",
				 date:df.parse("20060606"),
			     zoomLevel:7,
			     albumUrls:[
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5322163509796309921",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5322163348803091201",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5322163301461268705",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5322163230668729857",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5322163425775894801"
				    		]		),
  	new Trip(name:"Spain and France, 2011",
			     location:"Madrid, Spain",
			     description: "3 days in Paris, and 2 weeks in souther Spain",
				 date:df.parse("20110917"),
			     zoomLevel:4,
			     albumUrls:[
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5659821235689981265", 
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5659823072499258801"  
				    		]		), 
  	new Trip(name:"Puerto Rico",
			     location:"San Jose, Puerto Rico",
			     description: "Colonial San Juan, Culebra beaches, and the El Yunque rainforest",
				 date:df.parse("20110413"),
			     zoomLevel:6,
			     albumUrls:[
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5597879590905259361",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5597879790137798449", 
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5597879937219374849"  
				    		]		),
  	new Trip(name:"Italy",
			     location:"Bellagio, Italy",
			     description: "A quick few days in the Northern Lake District, finished off with a rainy weekend in Zurich",
				 date:df.parse("20100922"),
			     zoomLevel:6,
			     albumUrls:[
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5521906975773940513",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5521906892620287985", 
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5521906925737136017"  
				    		]		),
  	new Trip(name:"Romania",
			     location:"Brasov, Romania",
			     description: "A second visit to Romania gave us a chance to tour around the Saxon region of Transsylvania for a few days",
				 date:df.parse("20100926"),
			     zoomLevel:7,
			     albumUrls:[
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5521907019122323201",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5521907064599345889", 
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5521907127027122193"  
				    		]		),
	new Trip(name:"Norway",
			     location:"Ulvik, Norway",
			     description: "The fjords in western Norway is one of those places for which photos can't really do justice. The scale of everything is just too epic. ",
				 date:df.parse("20100608"),
			     zoomLevel:6,
			     albumUrls:[
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5481303968059993041",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5481304076626422497", 
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5481304473598454369", 
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5481304243036903937", 
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5481303739338138817", 
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5481303921991461009"  
				    		]		),
	  new Trip(name:"Quebec City",
			     location:"Quebec City",
			     description: "The Quebec Winter Carnivale - the temperature may be in the single digits up there, but they find reasons to celebrate.",
				 date:df.parse("20100214"),
			     zoomLevel:7,
			     albumUrls:[
						"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5481080405886029441"
				    		]		),				    		
	  new Trip(name:"Guanajuato, Mexico",
			     location:"Guanajuato",
			     description: "New Years Eve 2009: flew down to Mexico to hang out with the American retirees in San Miguel and the students in Guanajuato.",
				 date:df.parse("20100101"),
			     zoomLevel:6,
			     albumUrls:[
						"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5424563807090183537",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5424566274568952433"
				    		]		),				    		
	  new Trip(name:"Atlantic Canada",
			     location:"Truro, NS, Canada",
				 date:df.parse("20090914"),
			     zoomLevel:6,
			     description: "Road trip from Maine, up through New Brunswick, PEI, and Nova Scotia.",
			     albumUrls:[
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5373214446941043569",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5373214360083014337",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5373214501917210865",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5373214758674757905",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5373214649173767329",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5373214571496362561"
				    		]		),				    		
 	new Trip(name:"Iceland",
			     location:"Iceland",
			     description: "Lots of geothermal activity, glaciers, and a startling lack of trees make Iceland seem otherworldly. On the weekend it seems like everyone in the country (< 300,000 total) pours into Rejkyavik to get drunk.",
				 date:df.parse("20060301"),
			     zoomLevel:6,
			     albumUrls:[
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303313057044065",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317309390701418001",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317310382441851121",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317306519164245441"
				    		]		),
	  new Trip(name:"Nicaragua",
			     location:"Little Corn Island, Nicaragua",
			     description: "Another Central American getaway with Durkan. We flew to the Corn Islands for some diving with whale sharks and dolphins, then finished the trip in Granada.",
				 date:df.parse("20051210"),
			     zoomLevel:7,
			     albumUrls:[
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5322099106429510785",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5322099064047221553"
				    		]		),
	 new Trip(name:"Lapland",
			     location:"Kiruna,Sweden",
				 date:df.parse("20060306"),
			     zoomLevel:8,
			     description:"Definitely the most fun I've ever had at negative 30. After a week out dogsledding, the Ice Hotel actually felt pretty toasty.",
			     albumUrls:[
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317309933861201425",
				    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317311307744181233"
				    		]		),
	  new Trip(name:"Alaska",
			   zoomLevel:5,
			   date:df.parse("19960801"),
			   description: "From Anchorage to Mt. McKinley in an RV.",
			   albumUrls:[
		        		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317301807210419441"
			        	]
	  	),
	  new Trip(name:"Argentina",location:"Neuquen,Argentina", zoomLevel:4,
			   date:df.parse("20031202"),
			   description: "After about 3 days in Buenos Aires, I was checking out the prices to buy a place and stay for good. On this trip, with Durkan in tow, we also visited Patagonia and Peninsula Valdez.",
			   albumUrls:[
                  		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305429656249265",
                		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302385149038849",
                		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302404065293073"
                		]
	  	),
	  new Trip(name:"Eurail",location:"Luxembourg", zoomLevel:4,
		    description:"'Every white person takes at least one trip to Europe between the ages of 17-29. During this time they are likely to wear a back pack, stay at a hostel, meet someone from Ireland/Sweden/Italy with whom they have a memorable experience, get drunk, see some old churches and ride a train.'",
		    date:df.parse("19920604"),
		    albumUrls:[
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317243333464350673",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317301703963386241",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317301758588785969",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317301786686638769",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317301740799368305",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317301721949115281"
		    		]
		),
	  new Trip(name:"Highland Trail",location:"Scotland",
			date:df.parse("19970702"),
		    zoomLevel:6,
		    description:"I used to work with some guys who were *really* into the movie Braveheart. This resulted in a group expedition to hike the Highland Trail, near Glasgow, and attend the Highland Games -- this is where huge guys in kilts compete to throw tree trunks.",
		    albumUrls:[
		        		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302306189426433",
		        		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302581544125649"
		        		]
		),

	  new Trip(name:"Honduras",
			date:df.parse("19960202"),
 	        location:"Tegucigulpa",
		    zoomLevel:6,
		    description:"One of my co-workers had a sister working down in Tegucigulpa, Honduras -- a few of us flew down to visit, do some diving in Roatan, and visit the Mayan ruins at Copan. Also, we all got amoebic dysentery.",
		    albumUrls:[
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302203693064801",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302457896988913"
		    		]
		),
	  new Trip(name:"India",
			 date:df.parse("19970202"),
		     location:"Mumbai",
		     zoomLevel:5,
		     description:"My friend Darren was attempting to travel through India on 10 bucks a day, which made for some interesting accomodations. The trip started in Mumbai, wound down through Goa, to Kerala, then we took a 54 hour train ride back up north to Varanasi, which was the trip highlight.",
		     albumUrls:[
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302856922396673",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302899652716241",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302481477841553",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302509361691761",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302326991408929"
		    		]
		    		
		),
	  new Trip(name:"Ladakh",
			 date:df.parse("20080919"),
		     location:"Chandigarh, India",
		     zoomLevel:5,
		     description:"Ladakh is called 'Little Tibet' -- culturally and geographically, it has little similarly to the rest of the country.  The region is predominantly Buddhist, and has it's own language, Ladakhi, which is related to Tibetan. On this trip we also visted with friends in Delhi and spent a few days in the tourist hell that is Agra.",
		     albumUrls:[
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302771557480129",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305737757250641",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317310922199618177",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317306715783005553",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304420996381521"
		    		]
		),
	  new Trip(name:"Morocco",
			 date:df.parse("19940420"),
		     location:"Morocco",
		     zoomLevel:5,
		     description:"Back in 1994, this was the cheapest tour I could find out of London (the trip started the day Curt Kobain died). Having never been to a non-Western country, the sensory overload of Marrakesh blew my young mind.",
		     albumUrls:[
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317301640082484417",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317301669506039649"
		    		]
		    		
		),
	  new Trip(name:"Nepal/India",
			 date:df.parse("19981210"),
		     location:"Bhopal,India",
		     zoomLevel:5,
		     description:"Roopi's wedding was in Bhopal, but before and after the 3-days shasdi festivities, we managed to squeeze in side trips to Nepal and Jaisalmer.",
		     albumUrls:[
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302808388146321",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302669305752593",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302343994857281",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317306187383772225"
		    		]
		    		
		),
	  new Trip(name:"Rio",location:"Pirai, Brazil",zoomLevel:8,
			 date:df.parse("20080309"),
		     description:"A trip to Rio de Janiero, both the city and surrounding state, including the colonial city of Paraty, and a visit to the old mining towns in the surrounding mountains. The second week was spent aboard the Tocorime, a schooner built in the old 'tall ship' style.",
		     albumUrls:[
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302555415281569",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302694576070001",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305968812424081",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317306812844643233"
		    		]
		),
	  new Trip(name:"Romania",
			 date:df.parse("20081217"),
		     location:"Bucharest, Romania",
		     zoomLevel:7,
		     description:"Holidays in Romania. Mihaela and I went to visit her family for Christmas. A lot of time was spent of preparing the traditional holiday dishes, but we fit in time for a side trip up to the Carpathian mountain resort of Sinai.",
		     albumUrls:[
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302940839729601",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303006631615153",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304591763645377"
		    		]
		    		
		),
	  new Trip(name:"Thailand/Laos",
			 date:df.parse("19980520"),
		     location:"Thailand",
		     zoomLevel:5,
		     description:"Thailand in the summer was probably not the best bet, but somehow the spicy food actually cools your body down. In Laos, we traveled down the Mekong by speedboat, until the boat started leaking after colliding with another speedboat.",
		     albumUrls:[
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303060298607889",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302744015874545",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302445809614849",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302530460652721"
		    		]
		    		
		),
	  new Trip(name:"Turkey",
			 date:df.parse("19950502"),
		     location:"Turkey",
		     zoomLevel:5,
		     description:"",
		     albumUrls:[
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302245568082769",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302227250334913",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302287320228401"
		    		]
		    		
		),
	  new Trip(name:"USA",
			 date:df.parse("19940501"),
		     location:"Denver",
		     zoomLevel:3,
		     description:"Cross country with Dan and Sherry, just before starting my first job. We started down the East Coast, cut west to Nevada, then back home via Route 80 and the Jolly Green Giant statue.",
		     albumUrls:[
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302270931483953",
		    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303113138463633"
		    		]
		),
	  
	  new Trip(name:"Argentina",
			 date:df.parse("20061101"),
		     location:"Iguazu Falls,Argentina",
		     zoomLevel:4,
		     description:"A return trip to Argentina, this time with Jason and Yoyo. The trip started in Buenos Aires, then we flew up to Iguazu Falls, and finally spent a few days in and around Mendoza.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317309072785973825",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317308788191268705",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317308917515465937"
			    		]
		),
	  new Trip(name:"Bay Islands",
			 date:df.parse("20030615"),
		     location:"Roatan",
		     zoomLevel:8,
		     description:"A week of diving in the Bay Islands, with Durkan. We spent most of our time on Utila, where a 10-dive package was only 125 dollars!",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317306033328753041",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303396696181745"
			    		]	),
	  new Trip(name:"Chile",
		     location:"Ancud,Chile",
			 date:df.parse("20021201"),
		     zoomLevel:3,
		     description:"Starting in Santiago and heading down right to the edge of Tierra del Fuego. The starting point for planning the round-the-world itinerary was the cargo ferry that makes the 4-day run from Puerto Montt to Punta Arenas.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305204445281585",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317307001368402017",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303997463961601",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304744112188817",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317307514637117521",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305614031912193"
			    		]	),

	  new Trip(name:"China",
		     location:"Beijing",
			 date:df.parse("20010723"),
		     zoomLevel:6,
		     description:"After Mongolia, we had a 10 day stop in China, where they were celebrating their successful bid to host the Olympics. The trip out to Wu Tai Shan was an adventure -- I haven't felt so foreign in my life.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317307805544397873",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304785343306881",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304840333783025",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303728491787521"
			    		]	),
	new Trip(name:"Costa Rica",
		     location:"Drake, Costa Rica",
			 date:df.parse("19971220"),
		     zoomLevel:5,
		     description:"Costa Rica with Matt and Dan.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303152525192145"
			    		]	),
	  new Trip(name:"Cuba",
		     location:"Havana,Cuba",
			 date:df.parse("20030110"),
		     zoomLevel:6,
		     description:"Cuba is a time machine, right back to 1959... it's like time stopped the moment Fidel came to power. Great music, terrible food, great old cars, terrible internet access, great architecture.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303452272148721",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305485333811905",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317306431498322561"
			    		]	),
	  new Trip(name:"Cuba",
		     location:"Las Tunas, Cuba",
			 date:df.parse("20040522"),
		     zoomLevel:6,
		     description:"A return trip to Cuba, this time with Durkan. We spent most of the time on the eastern side of the island, around Santiago and Baracoa.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303189146343921",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317308401563950369",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317307934029761153"
			    		]
		),
	  new Trip(name:"East Africa",
		     location:"Ngorongoro Crater, Tanzania",
			 date:df.parse("20070601"),
		     zoomLevel:6,
		     description:"A classic East African big-game safari. Flew in to Nairobi and joined up with a tour group headed into Tanzania. The visit to Zanzibar at the end was the icing on the cake.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303253037655857",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302644901645857",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304894072419089",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5318376589510616065",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5318376654893188529",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5318376275679131697"
			    		]		),
	  new Trip(name:"Ecuador",
		     location:"Manta,Ecuador",
			 date:df.parse("20060626"),
		     zoomLevel:5,
		     description:"For a small country, Ecuador has an incredible range of terrains.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317308533111063745",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317307607665967793",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305548142389217",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305674805881393",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317307063385322289"
			    		]		),
	  new Trip(name:"Egypt",
		     location:"Egypt",
			 date:df.parse("20020920"),
		     zoomLevel:6,
		     description:"For the second stop on my RTW itinerary, I flew to Cairo and joined up with a tour group to see the architectural highlights of Egypt. The historical sites were amazing, and the locals were extremely friendly, especially considering that this was during the runup to the Gulf War. The best part was 3 days of drifting with the Nile current on a felucca -- nothing to do except play cards and cool off in the crocodile and bilharzia infested waters.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317307186353547873",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304103790536193",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303811181796097",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304942816698913",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304314058489265",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304055958483297"
			    		]		),
	  new Trip(name:"Greece",
		     location:"Serifos, Greece",
			 date:df.parse("20020909"),
		     zoomLevel:7,
		     description:"Kristen joined me for this first stop of my round-the-world itinerary. We stayed on Ydra, a tiny island with no motorized vehicles; Naxos, a backpacker haven; Amorgos, a sleepy and mosquito infested backwater; and finally Santorini, the most upscale stop with the best beaches.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305020914716321",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303871290407953",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304370879366177",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303752252672417",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304162031224897"
			    		]		),
	  new Trip(name:"Borneo",
		     location:"Kuching,Malaysia",
			 date:df.parse("20021010"),
		     zoomLevel:4,
		     description:"Sarawak has jungle and orang utans, and Sabah has the suprisingly challenging hike up Mt Kinabalu. My travel hub was Singapore, where I spent a few relaxing days with Roopi and Janya.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303656770734369",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303908940644081",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305091290153121"
			    		]		),
	  new Trip(name:"Mauritania",
		     location:"Mauritania",
			 date:df.parse("20041220"),
		     zoomLevel:7,
		     description:"This is one of those places that I couldn't have located on a map before I actually went there. The country is 80% desert, which is beautifully desolate. The 2 other people on my camel trek only spoke French, which made for some quiet dinners.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317306112413033089",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305799245253569",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317307307938998833"
			    		]		),
	  new Trip(name:"Mongolia",
		     location:"Ulaanbataar, Mongolia",
			 date:df.parse("20010707"),
		     zoomLevel:6,
		     description:"This was my first trip with a digital camera (a birthday gift from Shiv). We started in Ulaan Baatar, the capital, and toured around in a jeep for a few weeks with a driver who spoke no English and a guide who spoke very little. Outside of the capital city there are few paved roads, so they navigate by following the power lines.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317307698878814353",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317308672851221281",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317307413396407313",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304463403420945"
			    		]		),
	 new Trip(name:"New Zealand",
		     location:"Nelson, New Zealand",
			 date:df.parse("20021106"),
		     zoomLevel:5,
		     description:"Mostly the South Island, which has all the cool Lord Of the Rings terrain.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304203680112257",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305146669380817",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317308076988971137",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303581730459153",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303614658398097"
			    		]		),
	  new Trip(name:"Oaxaca",
		     location:"Oaxaca, Mexico",
			 date:df.parse("20071030"),
		     zoomLevel:10,
		     description:"Ed Sr., Kristen, and I all headed down to Oaxaca, Mexico to experience El Dia De Los Muertos (The Day of the Dead), and learn a bit about traditional Mexican cooking.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317308192448231409",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302614887281713",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305862013461777",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317309658582422625"
			    		]		),
	  new Trip(name:"Peru",
		     location:"Peru",
			 date:df.parse("20021228"),
		     zoomLevel:5,
		     description:"A visit to Machu Picchu, and a new years eve fiesta in Cuzco.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303489916181297",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304521127158401"
			    		]		),
	  new Trip(name:"Queensland",
		     location:"Queensland",
			 date:df.parse("20021024"),
		     zoomLevel:5,
		     description:"Australia is *huge*. What looks like a few miles on a map of the country turns out to be an 8-hour drive. Anyway, the Whitsundays and Fraser Island were both incredible.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303961505899777",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317309232964503921",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317306638948639953"
			    		]		),
	  new Trip(name:"French Polynesia",
		     location:"Moorea",
			 date:df.parse("20021126"),
		     zoomLevel:8,
		     description:"Between New Zealand and Chile, the plane has to stop 2 places: Tahiti and Easter Island. Nice.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303683213758129"
			    		]		),

	  new Trip(name:"Yucatan Peninsula",
		     location:"Tulum,Mexico",
			 date:df.parse("20040810"),
		     zoomLevel:6,
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304642663661377"
			    		]		),
	  new Trip(name:"New Guinea",
		     location:"Dili, Indonesia",
			 date:df.parse("20010302"),
		     zoomLevel:4,
		     description:"West Papua is technically part of Indonesia, but it doesn't feel like it. If you walk far enough into the jungle, they're still using stone tools here.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317306351112909985",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317308299850949937",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317302424949241041"
			    		]			),
	  new Trip(name:"West Africa",
		     location:"Sikasso,Mali",
			 date:df.parse("20030201"),
		     zoomLevel:5,
		     description:"My camera died in Dakar, so a lot of these pictures are from a professional photographer who was on my trip -- you can probably guess which ones.",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317306264551155201",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304695171325217",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317306910647627921",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305360995315201",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317303532732011377",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317304249087604129"
			    		]			),			
	  new Trip(name:"Italy",
		     location:"Venice",
			 date:df.parse("20020903"),
		     zoomLevel:13,
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5317305283313574625"
			    		]			),
	  new Trip(name:"Hawaii",
		     location:"Volcano, Hawaii",
			 date:df.parse("20090501"),
		     zoomLevel:8,
		     description:"The Big Island, in 3 days, which took us through at least distinct climates (hot and sandy, barren and sulfuric, and green and lush)",
		     albumUrls:[
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5335896338342377073",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5335896261399209777",
			    		"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5335896180605671505"
			    		]			),
	  new Trip(name:"Palau",
		     location:"Koror, Palau",
			 date:df.parse("20090509"),
		     zoomLevel:9,
		     description:"Palau is the westernmost country in Micronesia, and most of the attractions are underwater. We did a few days of diving, a few days of kayaking, and lots of snorkeling.",
		     albumUrls:[
					"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5335896056023665969",
					"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5335896129128734737",
					"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5335896147167865137",
					"http://picasaweb.google.com/data/feed/api/user/egbuck/albumid/5335896216551793585"
					]			),

	]
}