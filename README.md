# springboot-weather-restful-api
REST API service to provide weather information. Add and delete, get all weather report and by id

#POST request: 
-> Success 201, http://localhost:9191/weather/addWeather


Post JSON Body:


{
    "date":"14/02/2023",
    "lat":5685450,
    "lon":5145850,
    "city":"Singrauli",
    "state":"Madhya Pradesh",
    "temperature":20
}


#GET

Get by ID -> http://localhost:9191/weather/getWeatherById/2

GetAll - > http://localhost:9191/weather/getAllWeatherReports

#DELETE

->http://localhost:9191/weather/delete/3 if not exit return 404
