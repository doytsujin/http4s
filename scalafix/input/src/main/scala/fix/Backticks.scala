/*
rule = v0_22
*/
package fix

import org.http4s._
import scala.concurrent.duration._

object Backticks {
  val cacheDirectives = Set(
    CacheDirective.`max-age`(Duration.Zero),
    CacheDirective.`max-stale`(),
    CacheDirective.`min-fresh`(Duration.Zero),
    CacheDirective.`must-revalidate`,
    CacheDirective.`no-cache`(),
    CacheDirective.`no-store`,
    CacheDirective.`no-transform`,
    CacheDirective.`only-if-cached`,
    CacheDirective.`private`(),
    CacheDirective.public,
    CacheDirective.`proxy-revalidate`,
    CacheDirective.`s-maxage`(Duration.Zero),
    CacheDirective.`stale-if-error`(Duration.Zero),
    CacheDirective.`stale-while-revalidate`(Duration.Zero),
  )

  val charsets = Set(
    Charset.`US-ASCII`,
    Charset.`ISO-8859-1`,
    Charset.`UTF-8`,
    Charset.`UTF-16`,
    Charset.`UTF-16BE`,
    Charset.`UTF-16LE`,
  )

  val charsetRangeAll = CharsetRange.`*`

  val contentCodings = Set(
    ContentCoding.`*`,
    ContentCoding.aes128gcm,
    ContentCoding.br,
    ContentCoding.compress,
    ContentCoding.deflate,
    ContentCoding.exi,
    ContentCoding.gzip,
    ContentCoding.identity,
    ContentCoding.`pack200-gzip`,
    ContentCoding.zstd,
    ContentCoding.`x-compress`,
    ContentCoding.`x-gzip`,
  )

  val httpVersions = Set(
    HttpVersion.`HTTP/1.0`,
    HttpVersion.`HTTP/1.1`,
    HttpVersion.`HTTP/2.0`,
  )

  val languageTagAll = LanguageTag.`*`

  val mediaRanges = Set(
    MediaRange.`*/*`,
    MediaRange.`application/*`,
    MediaRange.`audio/*`,
    MediaRange.`image/*`,
    MediaRange.`message/*`,
    MediaRange.`multipart/*`,
    MediaRange.`text/*`,
    MediaRange.`video/*`,
  )

  val methods = Set(
    Method.ACL,
    Method.`BASELINE-CONTROL`,
    Method.BIND,
    Method.CHECKIN,
    Method.CHECKOUT,
    Method.CONNECT,
    Method.COPY,
    Method.DELETE,
    Method.GET,
    Method.HEAD,
    Method.LABEL,
    Method.LINK,
    Method.LOCK,
    Method.MERGE,
    Method.MKACTIVITY,
    Method.MKCALENDAR,
    Method.MKCOL,
    Method.MKREDIRECTREF,
    Method.MKWORKSPACE,
    Method.MOVE,
    Method.OPTIONS,
    Method.ORDERPATCH,
    Method.PATCH,
    Method.POST,
    Method.PRI,
    Method.PROPFIND,
    Method.PROPPATCH,
    Method.PUT,
    Method.REBIND,
    Method.REPORT,
    Method.SEARCH,
    Method.TRACE,
    Method.UNBIND,
    Method.UNCHECKOUT,
    Method.UNLINK,
    Method.UNLOCK,
    Method.UPDATE,
    Method.UPDATEREDIRECTREF,
    Method.`VERSION-CONTROL`,
  )

  val transferCodings = Set(
    TransferCoding.chunked,
    TransferCoding.compress,
    TransferCoding.deflate,
    TransferCoding.gzip,
    TransferCoding.identity,
  )
}