
<!-- Modal -->
<div class="modal fade" id="exampleModalUpdate" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Update Contact</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">

                <form method="POST" action="ContactServlet" id="formContactUpdate" enctype="multipart/form-data">

                    <div class="form-group" hidden>
                        <label for="txtIdu">ID</label>
                        <input type="text" class="form-control" id="txtIdu" name="txtIdu" 
                               placeholder="Enter ID">
                    </div>
                    <div class="form-group">
                        <label for="txtNameu">Name</label>
                        <input type="text" class="form-control" id="txtNameu" name="txtNameu" 
                               placeholder="Enter Name">
                    </div>
                    <div class="form-group">
                        <label for="txtAgeu">Age</label>
                        <input type="text" class="form-control" id="txtAgeu" name="txtAgeu" 
                               placeholder="Enter Age">
                    </div>
                    <div class="form-group">
                        <label for="txtAddressu">Address</label>
                        <input type="text" class="form-control" id="txtAddressu" name="txtAddressu" 
                               placeholder="Enter Address">
                    </div>

                    <button type="submit" class="btn btn-primary">Save Contact</button>
                </form>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
