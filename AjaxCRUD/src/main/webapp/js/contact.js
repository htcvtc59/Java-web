$(window).on('load', function () {

//    $.ajax({
//        url: 'ContactServlet',
//        data: {keysearch: "null", key: "null"},
//        dataType: 'json',
//        type: 'POST',
//        success: function (response) {
//            $(response).each(function (index, element) {
//                var content = "<tr>";
//                content += "<th scope=" + "row" + ">" + (index + 1) + "</th>";
//                content += "<td>" + element.id + "</td>";
//                content += "<td>" + element.name + "</td>";
//                content += "<td>" + element.age + "</td>";
//                content += "<td>" + element.address + "</td>";
//                content += "<td><button class='btn btn-success' data-id=" + element.id + ">Update</button>";
//                content += "<button class='btn btn-danger' data-id=" + element.id + ">Delete</button></td>";
//                content += "</tr>";
//                $("#tbodyContact").append(content).html();
//
//            });
//
//        },
//        timeout: 2000
//
//    });

    loadTableContact("null", "null");


});

function loadTableContact(keysearch, key) {

    $('#pagination-container').pagination({
        dataSource: function (done) {
            var result = [];
            $.ajax({
                type: 'POST',
                url: 'ContactServlet',
                dataType: 'json',
                data: {keysearch: keysearch, key: key},
                success: function (response) {
                    $(response).each(function (index, element) {
                        result.push(element);
                    });
                    done(result);
                },
                timeout: 0
            });
        },
        className: 'paginationjs-theme-blue paginationjs-big',
        showGoInput: true,
        showGoButton: true,
        pageSize: 10,
        callback: function (data, pagination) {
            console.log(pagination);
            function simpleTemlating(data) {
                var content = "";
                $.each(data, function (index, item) {
                    content += "<tr id='rowc" + item.id + "'>";
                    content += "<th scope=" + "row" + ">" + (index + 1) + "</th>";
                    content += "<td class='itemid" + item.id + "'>" + item.id + "</td>";
                    content += "<td class='itemname" + item.id + "'>" + item.name + "</td>";
                    content += "<td class='itemage" + item.id + "'>" + item.age + "</td>";
                    content += "<td class='itemaddress" + item.id + "'>" + item.address + "</td>";
                    content += "<td><button class='btn btn-success card-title btnUpdate' data-toggle='modal' data-target='#exampleModalUpdate' data-id=" + item.id + ">Update</button>";
                    content += "<button class='btn btn-danger btnDelete' data-id=" + item.id + " style='margin-bottom:10px'>Delete</button></td>";
                    content += "</tr>";
                });
                return content;
            }
            var html = simpleTemlating(data);
            $("#tbodyContact").html(html);
        }
    });


}

$(document).ready(function () {

    alert(1111);

    $('#btnSearch').off('click').on('click', function () {

        $('#pagination-container').empty();
        loadTableContact($('#idsContact').val(), "name");
    });


    $("#formContactCreate").on("submit", function (e) {
        e.preventDefault();
        $.ajax({
            url: 'ContactServlet',
            data: $(this).serialize(),
            dataType: 'json',
            type: 'POST',
            success: function (response) {
                var content = "<tr id='rowc" + response.id + "'>";
                content += "<th scope=" + "row" + ">" + response.row + "</th>";
                content += "<td class='itemid" + response.id + "'>" + response.id + "</td>";
                content += "<td class='itemname" + response.id + "'>" + response.name + "</td>";
                content += "<td class='itemage" + response.id + "'>" + response.age + "</td>";
                content += "<td class='itemaddress" + response.id + "'>" + response.address + "</td>";
                content += "<td><button class='btn btn-success card-title btnUpdate' data-toggle='modal' data-target='#exampleModalUpdate' data-id=" + response.id + ">Update</button>";
                content += "<button class='btn btn-danger btnDelete' data-id=" + response.id + " style='margin-bottom:10px'>Delete</button></td>";
                content += "</tr>";
                $("#tbodyContact").append(content);
            },
            timeout: 1000

        });

    });

    $('#formContactUpdate').on("submit", function (e) {
        e.preventDefault();
        $.ajax({
            url: 'ContactServlet',
            data: $(this).serialize(),
            dataType: 'json',
            type: 'GET',
            contentType: 'application/json; charset=utf-8',
            success: function (response) {
                var id = response.id;
                $('.itemname' + id).text(response.name);
                $('.itemage' + id).text(response.age);
                $('.itemaddress' + id).text(response.address);
            },
            timeout: 1000
        });

    });



    $(document).off('click').on('click', '.btnUpdate', function (e) {
        e.preventDefault();
        var idrow = $(this).data('id');
        var ido = $('.itemid' + idrow).text();
        var name = $('.itemname' + idrow).text();
        var age = $('.itemage' + idrow).text();
        var address = $('.itemaddress' + idrow).text();

        $.post('update.jsp', {id: ido, name: name, age: age, address: address}, function () {
            $('#txtIdu').removeAttr('placeholder').val(ido);
            $('#txtNameu').removeAttr('placeholder').val(name);
            $('#txtAgeu').removeAttr('placeholder').val(age);
            $('#txtAddressu').removeAttr('placeholder').val(address);
        });

    });


    $("body").off('click').on('click', '.btnDelete', function (e) {
        e.preventDefault();
        var id = "rowc" + $(this).data('id');
        $.ajax({
            url: 'ContactServlet',
            data: {id: $(this).data('id'), ac: 'Delete'},
            dataType: 'json',
            type: 'GET',
            contentType: 'application/json; charset=utf-8',
            success: function (res) {
                if (res.status == true) {
                    $('#' + id).remove();
                }
            },
            timeout: 1000
        });

    });



});
