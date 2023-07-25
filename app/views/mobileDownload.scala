package views.html

import controllers.routes

import lila.app.templating.Environment.{ given, * }
import lila.app.ui.ScalatagsTemplate.*
import lila.common.LangPath

object mobileDownload:

  def apply(apkDoc: io.prismic.Document, resolver: io.prismic.DocumentLinkResolver)(using PageContext) =
    views.html.base.layout(
      title = "Mobile Download"
    ) {}

  lazy val androidLink = "https://play.google.com/store/apps/details?id=org.lichess.mobileapp"
  lazy val appleLink   = "https://itunes.apple.com/us/app/lichess-free-online-chess/id968371784"
