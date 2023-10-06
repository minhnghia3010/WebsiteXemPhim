package control;

import dao.DAO;
import entity.*;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="DeleteControl", urlPatterns={"/Delete"})
public class DeleteControl extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String idTK = request.getParameter("idTK");
        String idDG = request.getParameter("idDG");
        String idAdTTP = request.getParameter("idAdTTP");
        String idAdP = request.getParameter("idAdP");
        String idTL = request.getParameter("idTL");
        String idDM = request.getParameter("idDM");
        
        DAO dao =  new DAO();
        
        if(idTK != null){
            dao.deleteTaiKhoan(idTK);
            response.sendRedirect("Admin");
        }if (idDG != null) {
            dao.deleteDanhGia(idDG);
            response.sendRedirect("Admin");
        }if (idAdTTP != null) {
            dao.deleteAdminThongTinPhim(idAdTTP);
            response.sendRedirect("Admin");
        }if (idAdP != null) {
            dao.deleteAdminPhim(idAdP);
            response.sendRedirect("Admin");
        }if (idTL != null) {
            dao.deleteTheLoai(idTL);
            response.sendRedirect("Admin");
        }if (idDM != null) {
            dao.deleteDanhMuc(idDM);
            response.sendRedirect("Admin");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
