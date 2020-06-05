package uk.co.devexe

import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class JsoupParserSpec extends AnyWordSpec with Matchers {

  "jdksajdla" should {
    "dsdhasdh" in {
      val cleanHtml = JsoupParser.cleanHtml("\\n<h1>VAT Return Direct Debit: Advance notice of your payment</h1>\\n\\n<p>Dear REDACTED</p>\\n<p><strong class=\\\"bold\\\">Direct Debit mandate reference</strong> 000917170677</p>\\n\\n<p>This notice is for information purposes only. We will collect £32,055.13 on or just after 14 April 2020. </p>\\n\\n<table width=\\\"100%\\\">\\n    <thead>\\n        <tr>\\n            <th class=\\\"bold\\\">Charge type</th>\\n            <th class=\\\"bold\\\">Period</th>\\n            <th class=\\\"bold\\\">Amount</th>\\n        </tr>\\n    </thead>\\n    <tbody>\\n    \\n        <tr>\\n            <td>VAT Return Charge</td>\\n            <td>February 2020</td>\\n            <td>\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000</td>\\n        </tr>\\n    \\n    </tbody>\\n</table>\\n\\n<br />\\n<p>Make sure you have enough funds in your account to meet this payment.</p>\\n<p>Payments will appear on your bank statement as 'HMRC E VAT'.</p>\\n<p>If there are any changes to the amount, date or frequency of your Direct Debit we will let you know at least 2 working days in advance of your account being debited.</p>\\n<p>If you have any questions, call 03002003700 and quote your Direct Debit reference.</p>\\n\\n<p>From HMRC Direct Debit Team</p>\\n")
      //val cleanHtml = JsoupParser.cleanHtml("<img class=\"cool\" src=\"https://www.tax.service.gov.uk/assets/4.8.0/images/direct-debit-logo.png\" alt=\"Larry the cat, Chief Mouser to the Cabinet Office, sitting on a meeting table wearing a Union Jack bowtie.\">")
      cleanHtml mustBe("<img class=\"cool\" src=\"https://www.tax.service.gov.uk/assets/4.8.0/images/direct-debit-logo.png\" alt=\"Larry the cat, Chief Mouser to the Cabinet Office, sitting on a meeting table wearing a Union Jack bowtie.\">")
    }
  }



}
