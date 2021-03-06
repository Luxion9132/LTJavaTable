package ltjavatable;

import java.awt.FileDialog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *  
 * @author Leon
 */
public class LTJavaTable extends javax.swing.JFrame {

    /**
     * Creates new form TableForm
     */
    public LTJavaTable() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="產生圖形介面外觀與插入事件 Gegenerated by the Netbeans Form Editor.">  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfProdName = new javax.swing.JTextField();
        cbCategory = new javax.swing.JComboBox();
        tfPrice = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        labMessage = new javax.swing.JLabel();
        bExportFile = new javax.swing.JButton();
        bImportFile = new javax.swing.JButton();
        bClearTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"pro", "elect", "500"},
                {"product1", "art", "10.0"}
            },
            new String [] {
                "Product Name", "Category", "Price"
            }
        ));
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);

        jLabel1.setText("Product Name: ");

        jLabel2.setText("Category");

        jLabel3.setText("Price");

        cbCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Electonic", "Art", "Food", " ", " " }));

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfPrice)
                    .addComponent(cbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfProdName))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(tfProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd)
                    .addComponent(bUpdate)
                    .addComponent(bDelete))
                .addGap(20, 20, 20))
        );

        bExportFile.setText("Export Excel");
        bExportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExportFileActionPerformed(evt);
            }
        });

        bImportFile.setText("Import Excel");
        bImportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImportFileActionPerformed(evt);
            }
        });

        bClearTable.setText("Clear Table");
        bClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bExportFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bImportFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bClearTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bExportFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bImportFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bClearTable)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // </editor-fold>  
    
    //<editor-fold defaultstate="collapsed" desc="按鈕事件">
    /**
     * button事件 新增資料
     *
     * @param evt
     */
    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableData.getModel(); //dtm是介面tablemodel的實作 為何轉型為dtm?        
        if (tfProdName.getText().trim().equalsIgnoreCase("")) { //檢查product name欄位是否為空字串
            labMessage.setText("product name不可為空白");
        } else {
            model.addRow(new Object[]{tfProdName.getText(), cbCategory.getSelectedItem().toString(), tfPrice.getText()});

        }

    }//GEN-LAST:event_bAddActionPerformed
    /**
     * button事件 修改資料
     *
     * @param evt
     */
    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableData.getModel(); //DefaltTableModel是TableModel的實作子類別 實現add remove等方法, 這裡直接轉型宣告  
        if (tableData.getSelectedRow() == -1) {//沒有選擇row回傳-1
            labMessage.setText("Update請選擇要修改的資料");
        }
        model.setValueAt(tfProdName.getText(), tableData.getSelectedRow(), 0);
        model.setValueAt(cbCategory.getSelectedItem(), tableData.getSelectedRow(), 1);
        model.setValueAt(tfPrice.getText(), tableData.getSelectedRow(), 2);
    }//GEN-LAST:event_bUpdateActionPerformed
    /**
     * button事件 刪除資料
     *
     * @param evt
     */
    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableData.getModel();
        if (tfProdName.getText().trim().equalsIgnoreCase("")) { //檢查product name欄位是否為空字串
            labMessage.setText("請選擇欲刪除的資料");
        } else {
            model.removeRow(tableData.getSelectedRow());
        }
    }//GEN-LAST:event_bDeleteActionPerformed
    /**
     * 滑鼠點擊data table就將現有row data填入輸入表單 方便update
     *
     * @param evt
     */
    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        DefaultTableModel model = (DefaultTableModel) tableData.getModel();
        tfProdName.setText(model.getValueAt(tableData.getSelectedRow(), 0).toString());
        cbCategory.setSelectedItem(model.getValueAt(tableData.getSelectedRow(), 1));
        tfPrice.setText(model.getValueAt(tableData.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tableDataMouseClicked

    private void bExportFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExportFileActionPerformed
        String filename = "D:/testExcel.xls";
        
        try {
//            exportTable(tableData);
            exportTableApachePOI(tableData, new File(filename)); //匯出table到excel
        } catch (IOException ex) {
            ex.printStackTrace();
            labMessage.setText("匯出失敗: " + ex.getMessage());
            return;
        }
        labMessage.setText("匯出成功,路徑: " + filename);

    }//GEN-LAST:event_bExportFileActionPerformed

    private void bImportFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImportFileActionPerformed

        importTableApachePOI(tableData); //匯出table到excel            

    }//GEN-LAST:event_bImportFileActionPerformed

    private void bClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearTableActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableData.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_bClearTableActionPerformed
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="自訂方法 存取excel">    
    /**
     * 將JTable匯出 http://blog.csdn.net/jueblog/article/details/10019635
     * @param table 資料table
     * @param file 匯出file
     * @throws IOException, new FileWriter(file)拋出的例外
     */
    private void exportTable(JTable table) throws IOException {
        //跳出視窗選擇儲存file
        FileDialog fd = new FileDialog(this, "保存流水记录", FileDialog.SAVE);
        fd.setLocation(400, 250);
        fd.setVisible(true);
        String stringfile = fd.getDirectory() + fd.getFile() + ".xls"; //file全名路徑
        File file = new File(stringfile);

        //輸出file 
        TableModel model = table.getModel();
        BufferedWriter bWriter;
        bWriter = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < model.getColumnCount(); i++) {
            bWriter.write(model.getColumnName(i));
            bWriter.write("\t");
        }
        bWriter.newLine();
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                bWriter.write(model.getValueAt(i, j).toString());
                bWriter.write("\t");
            }
            bWriter.newLine();
        }
        bWriter.close();
        System.out.println("write out to: " + file);
    }

    /**
     * 使用apache POI匯出JTable到excel reference:
     * http://poi.apache.org/spreadsheet/how-to.html
     */
    private void exportTableApachePOI(JTable table, File file) throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream(file);
        Workbook wb = new HSSFWorkbook();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Sheet sheet = wb.createSheet("JTable Data page1");
        Row r_pointer = null;
        Cell c_pointer = null;
        //建立第一列標頭header
        r_pointer = sheet.createRow(0);
        for (int headColumn = 0; headColumn < model.getColumnCount(); headColumn++) {
            c_pointer = r_pointer.createCell(headColumn);
            c_pointer.setCellValue(model.getColumnName(headColumn));
        }
        //第二列開始填資料        
        for (int excelRow = 1, dataRow = 0; dataRow < model.getRowCount(); excelRow++, dataRow++) { //excelRow, dataRow分別表示excel列與JTable列 改善程式可讀性
            r_pointer = sheet.createRow(excelRow);
            for (int excelColumn = 0; excelColumn < model.getColumnCount(); excelColumn++) {
                c_pointer = r_pointer.createCell(excelColumn);
                c_pointer.setCellValue(model.getValueAt(dataRow, excelColumn).toString());
            }
        }
        wb.write(fout);
        fout.close();
    }

    /**
     * 使用apachePOI 讀取excel到JTable
     *
     * @param tableData
     */
    private void importTableApachePOI(JTable tableData) {
        FileInputStream in = null;
        Workbook wb1 = null;
        //建立WorkBook讀取
        try {
            JFileChooser fjc = new JFileChooser();
            if (fjc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File intputFile = fjc.getSelectedFile();
                in = new FileInputStream(intputFile);
                wb1 = WorkbookFactory.create(in);
//                System.out.println(wb1.getClass());                

                Sheet s = wb1.getSheetAt(0);
                DefaultTableModel model = (DefaultTableModel) tableData.getModel();
                model.setRowCount(0); //清空table
                //Vector tempRowData = new Vector();//用於暫存excel匯入的row資料        
                Vector tempRowData;
                String content;                
                
                for (Row r : s) {
                    tempRowData = new Vector(); //note: tempRowData.clear()會出現nullpoint
                    for (Cell c : r) {
                        c.setCellType(Cell.CELL_TYPE_STRING);
                        content = c.getStringCellValue();
                        //model.addRow(new Object[] {tfProdName.getText(),cbCategory.getSelectedItem().toString(),tfPrice.getText()});
                        tempRowData.add(content);
                    }                    
                    model.addRow(tempRowData);                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                System.out.println("file close excpeiton: " + e.getMessage());
                return;
            }
        }
    }
//</editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LTJavaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LTJavaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LTJavaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LTJavaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LTJavaTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bClearTable;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bExportFile;
    private javax.swing.JButton bImportFile;
    private javax.swing.JButton bUpdate;
    private javax.swing.JComboBox cbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labMessage;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfProdName;
    // End of variables declaration//GEN-END:variables

}
