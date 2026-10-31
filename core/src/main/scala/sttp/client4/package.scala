package sttp

import sttp.attributes.AttributeKey

package object client4 extends SttpApi {

  /** An optional URI template describing a request's route, e.g. `/users/{id}`, for logging, metrics, or tracing. The
    * value is an opaque string: sttp does not validate or expand it. Setting this attribute does not change the request
    * URI. It is preserved when following redirects, so consumers must decide whether it still describes the redirected
    * request. Backends and wrappers must explicitly read it to use it.
    */
  val RouteTemplateAttribute: AttributeKey[String] = new AttributeKey[String]("sttp.client4.route-template")

  /** The type of a predicate that can be used to determine, if a request should be retries.
    * @see
    *   [[RetryWhen.Default]]
    */
  type RetryWhen = (GenericRequest[?, ?], Either[Throwable, Response[?]]) => Boolean
}
