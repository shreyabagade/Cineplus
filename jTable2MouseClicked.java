private void jTable2MouseClicked(java.awt.event.MouseEvent evt)
{                                    
 
         double sum = 0.0;    
         d = (DefaultTableModel)jTable2.getModel();
         int selectIndex = jTable2.getSelectedRow();
            
         String id = d.getValueAt(selectIndex, 0).toString();
         String ticketname = d.getValueAt(selectIndex, 1).toString();
         int price = Integer.parseInt(d.getValueAt(selectIndex, 2).toString());
 
         int qty = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Qty"));      
            
         int tot = price * qty;
            
         d = (DefaultTableModel)jTable1.getModel();
            
            d.addRow(new Object[]          
            {
              id,
              ticketname,
              price,
              qty,
              tot
             }        
            );    
        
    for(double i=0; i<jTable1.getRowCount(); i++)
     {
 
sum = sum + Double.parseDouble(jTable1.getValueAt((int)i,4).toString());
    }
        txtbill.setText(Double.toString(sum));
    }