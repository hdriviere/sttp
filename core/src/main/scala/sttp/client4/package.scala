package sttp

import sttp.attributes.AttributeKey

package object client4 extends SttpApi {

  /** An optional URI template describing a request's route, e.g. `/users/{id}`, for logging, metrics, or tracing.
    * Setting this attribute does not change the request URI. Backends and wrappers must explicitly read it to use it.
    */
  val RouteTemplateAttribute: AttributeKey[String] = new AttributeKey[String]("sttp.client4.route-template")

  /** The type of a predicate that can be used to determine, if a request should be retries.
    * @see
    *   [[RetryWhen.Default]]
    */
  type RetryWhen = (GenericRequest[?, ?], Either[Throwable, Response[?]]) => Boolean
}
