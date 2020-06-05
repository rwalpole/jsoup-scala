package uk.co.devexe

import jdk.nashorn.internal.ir.WhileNode
import org.jsoup.Jsoup
import org.jsoup.nodes.Document.OutputSettings
import org.jsoup.safety.Whitelist

object JsoupParser {jso

  val whitelist = Whitelist.relaxed()

  private def relaxedWhitelistWithClassAttributes(): Whitelist = {
    // We want to allow "class" for all allowed tags.  Unfortunately there is no way to do
    // getTags() on a Whitelist, so I have copied the list of tags from the Whitelist.relaxed()
    // implementation here.  Obviously this is not ideal, but there isn't a way around it.
    val allTags = List(
      "a",
      "b",
      "blockquote",
      "br",
      "caption",
      "cite",
      "code",
      "col",
      "colgroup",
      "dd",
      "div",
      "dl",
      "dt",
      "em",
      "h1",
      "h2",
      "h3",
      "h4",
      "h5",
      "h6",
      "i",
      "img",
      "li",
      "ol",
      "p",
      "pre",
      "q",
      "small",
      "span",
      "strike",
      "strong",
      "sub",
      "sup",
      "table",
      "tbody",
      "td",
      "tfoot",
      "th",
      "thead",
      "tr",
      "u",
      "ul"
    )

    allTags.foldLeft(Whitelist.relaxed()) { (whitelist, tag) =>
      whitelist.addAttributes(tag, "class")
    }
  }

  def cleanHtml(dirtyHtml: String) = {
   val settings = new OutputSettings().prettyPrint(false).syntax(OutputSettings.Syntax.xml)
   Jsoup.clean(dirtyHtml, "", relaxedWhitelistWithClassAttributes(), settings)
  }

}
