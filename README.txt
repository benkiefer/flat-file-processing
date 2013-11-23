Stories:

1) Given a list of orders, when I run the report, I see a line item for each order item from an order. The format is listed here.

File Format:
----------------------------------

Start Position   	 Length	     Usage	Keith Notes
1                	 2        	 Record Type (alway PT)
3                	 3        	 Item Code
6                	 9        	 Merchant Number (always 000456000)
15               	 9       	 Filler	all zeros
24               	 7       	 Customer ID (must have leading zero, if less than 7)
31               	 1       	 Check Digit (could not find that we use this in the import)	0
32               	 4       	 Year  (Goes into the transaction date)	2013
36               	 2       	 Month (Goes into the transaction date)	02
38               	 2       	 Day (Goes into the transaction date)	13
40               	 8       	 Amount 1 (Unused)	All zeros
48               	 8       	 Amount 2 (amount of the transaction)	00163010 ($1630.10)
56               	 1       	 Payment Indicator (ACH or Credit Card payment)	A (anything else is Credit Card)
57               	 3       	 Return Code (could not find that we use this in the import)
60               	 2       	 Credit Card Type (could not find that we use this in the import)
62               	 16      	 Customer Last Name (could not find that we use this in the import)
78               	 3       	 Filler (spaces)

2) Given a list of orders containing both convenience fees and order items, when I run the order item report, I only see order items. When I run the convenience fee report, I only see convenience fee items.
