package com.quarkus.smartbackoffice.mappers;

import com.quarkus.smartbackoffice.persistence.entity.Table;
import com.quarkus.smartbackoffice.provider.models.TableDto;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-01T19:22:25+0100",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class TableMapperImpl implements TableMapper {

    @Override
    public List<TableDto> mapToTableDtos(List<Table> tables) {
        if ( tables == null ) {
            return null;
        }

        List<TableDto> list = new ArrayList<TableDto>( tables.size() );
        for ( Table table : tables ) {
            list.add( mapToTableDto( table ) );
        }

        return list;
    }

    @Override
    public TableDto mapToTableDto(Table table) {
        if ( table == null ) {
            return null;
        }

        TableDto.TableDtoBuilder<?, ?> tableDto = TableDto.builder();

        tableDto.name( table.getName() );
        tableDto.seatCount( table.getSeatCount() );
        tableDto.active( table.getActive() );

        return tableDto.build();
    }

    @Override
    public List<Table> mapToTables(List<TableDto> tableDtos) {
        if ( tableDtos == null ) {
            return null;
        }

        List<Table> list = new ArrayList<Table>( tableDtos.size() );
        for ( TableDto tableDto : tableDtos ) {
            list.add( mapToTable( tableDto ) );
        }

        return list;
    }

    @Override
    public Table mapToTable(TableDto tableDto) {
        if ( tableDto == null ) {
            return null;
        }

        Table.TableBuilder table = Table.builder();

        table.name( tableDto.getName() );
        table.seatCount( tableDto.getSeatCount() );
        table.active( tableDto.getActive() );

        return table.build();
    }
}
