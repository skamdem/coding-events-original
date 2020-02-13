# coding-events-original

1. Purpose of the app:
Store a collection of events and details about them. The events each belong to a specific category and may be tagged with multiple "tags"
 
2. current state of the app.
Works well with categories and tags.

3. future improvements including notes about the Person class.
Add a "Person" class so that people can sign up for accounts to follow the events they are most interested in and keep track of their calendar of events. 

Below are details of the future "Person" class

3.1.
Person class to hold necessary info about users of our app. 
Fields and methods in this class

Class Person {

//Fields
Name			:String<br>
User ID			:int<br>
Email adress		:String<br>
Password		:String<br>
Person details		:PersonDetails<br>

//Methods: getters and setters

}

3.2.
Additional classes to Person to make the app work:

Class PersonDetails {

Location		:String<br>
Hometown		:String<br>
Language		:String<br>
Birthday		:String<br>
Gender			:Enum(male, female) <br>

join date		:String<br>
Social Networks		:List<SocialNetwork><br>
Interests (tags)	:List<Tag><br>
photo			:file<br>
Events subscribed	:List<Event><br>
Bio			:String<br>

//Methods: getters and setters

}

Class SocialNetwork {

name	:String<br>
logo	:file<br>
URL	:String<br>

//Methods: getters and setters

}


<strong>Existing classes:</strong><br>
Event<br>
EventCategory<br>
EventDetails<br>
Tag<br>

<strong>New classes to be created:</strong><br>
Person <br>
PersonDetails<br>
SocialNetwork<br>
Event<br>

3.3.
relationships between "Person" and other classes to be created, and the "Event" class<br>
Person <--> PersonDetails	: OneToOne<br>
Person <--> SocialNetwork	: ManyToMany	(through PersonDetails)<br>
Person <--> Event		: ManyToMany	(through PersonDetails)<br>
