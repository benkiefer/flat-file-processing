**Stories**

1. Given a list of orders, when I run the report, I see a line item for each order item from an order. The format is listed here.
2. Given a list of orders containing both convenience fees and order items, when I run the order item report, I only see order items. When I run the convenience fee report, I only see convenience fee items.

**File Format**
----------------------------------

<table>
<tr><th>Start Position</th><th>Length</th><th>Usage	Notes</th></tr>
<tr><td>1</td><td>2</td><td>Record Type (alway PT)</td></tr>
<tr><td>3</td><td>3</td><td>Item Code</td></tr>
<tr><td>6</td><td>9</td><td>Merchant Number (always 000456000)</td></tr>
<tr><td>15</td><td>9</td><td>Filler	all zeros</td></tr>
<tr><td>24</td><td>7</td><td>Customer ID (must have leading zero, if less than 7)</td></tr>
<tr><td>31</td><td>1</td><td>Check Digit (could not find that we use this in the import, use 0)</td></tr>
<tr><td>32</td><td>4</td><td>Year  (Goes into the transaction date)	2013</td></tr>
<tr><td>36</td><td>2</td><td>Month (Goes into the transaction date)	02</td></tr>
<tr><td>38</td><td>2</td><td>Day (Goes into the transaction date)	13</td></tr>
<tr><td>40</td><td>8</td><td>Amount 1 (Unused)	All zeros</td></tr>
<tr><td>48</td><td>8</td><td>Amount 2 (amount of the transaction)	00163010 ($1630.10)</td></tr>
<tr><td>56</td><td>1</td><td>Payment Indicator (ACH or Credit Card payment)	A (anything else is Credit Card)</td></tr>
<tr><td>57</td><td>3</td><td>Return Code (could not find that we use this in the import)</td></tr>
<tr><td>60</td><td>2</td><td>Credit Card Type (could not find that we use this in the import)</td></tr>
<tr><td>62</td><td>16</td><td>Customer Last Name (could not find that we use this in the import)</td></tr>
<tr><td>78</td><td>3</td><td>Filler (spaces)</td></tr>
</table>

