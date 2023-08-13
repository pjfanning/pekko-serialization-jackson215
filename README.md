# pekko-serialization-jackson215

Jackson 2.15 equivalent of [pekko-serialization-jackson](https://pekko.apache.org/docs/pekko/current/serialization-jackson.html) which uses Jackson 2.14.

The main reason to use Jackson 2.15 is for its [StreamReadConstraint](https://www.javadoc.io/static/com.fasterxml.jackson.core/jackson-core/2.15.2/com/fasterxml/jackson/core/StreamReadConstraints.html) support. Users who want to override the default constraints should override the settings in the [config](https://github.com/lightbend/config), see [reference.conf](https://github.com/pjfanning/pekko-serialization-jackson215/blob/main/src/main/resources/reference.conf).

Config names for this library start with `pekko.serialization.jackson215` as opposed to `pekko.serialization.jackson`.

If you want to use Jackson 2.15 with [Pekko HTTP](https://pekko.apache.org/docs/pekko-http/current), use [pekko-http-jackson](https://github.com/pjfanning/pekko-http-json) v2.1.0 instead.
