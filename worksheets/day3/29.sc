import play.api.libs.json._
import data.Data

def transform(json: JsValue): JsValue = {
  // number -> square it
  if(json.isInstanceOf[JsNumber]) {
    val x = json.asInstanceOf[JsNumber].value
    JsNumber(x * x)
  } else if(json.isInstanceOf[JsArray]) {
    val xs = json.asInstanceOf[JsArray].value
    JsArray(xs.map(transform))
  } else if(json.isInstanceOf[JsObject]) {
    val xs = json.asInstanceOf[JsObject].value
    JsObject(xs.mapValues(transform).toMap)
  } else {
    json
  }


  // null -> make it string "I am null"
  // boolean -> flip it
  // string -> make it "Hello $string"
  // string but starts with urn: -> make it "string"
  // if the key is m or n -> keep it as is
}


Json.prettyPrint(transform(Data.json))
